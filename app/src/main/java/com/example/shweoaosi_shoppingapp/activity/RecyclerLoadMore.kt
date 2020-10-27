package com.example.shweoaosi_shoppingapp.activity

import com.example.shweoaosi_shoppingapp.MyAdapterOnLoadMoreListener
import com.example.shweoaosi_shoppingapp.MyRecyclerViewRowClickListener
import com.example.shweoaosi_shoppingapp.adapter.SearchAdapter
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.shweoaosi_shoppingapp.MyDialogUty
import com.example.shweoaosi_shoppingapp.R
import com.example.shweoaosi_shoppingapp.call.ProvideRetrofit
import com.example.shweoaosi_shoppingapp.model.SearchModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.recycler_loadmore.*
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException

class RecyclerLoadMore : AppCompatActivity(){

    private var compositeDisposable = CompositeDisposable()
    private val myApiService by lazy { ProvideRetrofit.create(this)}
    private var loadingDialog: AppCompatDialog? = null

    private  var isLoading : Boolean = false
    private var currentPage: Int = 1
    private lateinit var searchAdapter : SearchAdapter
    private lateinit var searchList: MutableList<SearchModel.Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_loadmore)
        //loadMore Recycler
        setupRecycler();
    }

    private fun setupRecycler() {
        currentPage = 1
        //change phone size and tablet size Recycler GridLayoutView
        if ((resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE)
            //for tablet size GridLayout
            recyclerViewLoadMore.layoutManager = androidx.recyclerview.widget.GridLayoutManager(
                this,
                3,
                RecyclerView.VERTICAL,
                false
            )
        else
            //for phone size Recycler GridLayoutView
            recyclerViewLoadMore.layoutManager = androidx.recyclerview.widget.GridLayoutManager(
                this,
                2,
                RecyclerView.VERTICAL,
                false
            )
        recyclerViewLoadMore.isNestedScrollingEnabled = false
        ViewCompat.setNestedScrollingEnabled(recyclerViewLoadMore,false)
        searchList = ArrayList()
        searchAdapter = SearchAdapter(searchList, object : MyRecyclerViewRowClickListener {
            override fun onRowClicked(position: Int) {
                TODO("Not yet implemented")
            }
        })

        searchAdapter.setLoadMoreListener(object : MyAdapterOnLoadMoreListener {
            override fun onLoadMore() {
                recyclerViewLoadMore.post {
                    ++currentPage
                    callSearch()
                }
            }
        })
        recyclerViewLoadMore.adapter = searchAdapter
        callSearch()
    }

    private  fun callSearch(){
        //load more
        if(currentPage >= 2){
            searchList.add(SearchModel.Item())
            searchAdapter.notifyItemInserted(searchList.size - 1)
        }

        val hHashMap = LinkedHashMap<String, String> ()

        val queryMap = LinkedHashMap<String, String> ()

        queryMap["title"] = ""
        queryMap["page"] = currentPage.toString()

        compositeDisposable.add(
            myApiService.callSearch(headerMap = hHashMap, queryMap = queryMap)
                .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    if (currentPage == 1)
                        pbProgressBar.visibility = View.VISIBLE
                    isLoading = true
                }//show loading
                .doAfterTerminate {
                    //                    loadingDialog?.dismiss()
                    if (currentPage == 1)
                        pbProgressBar.visibility = View.GONE
                }//hide loading
                .subscribe({ responseData ->
//                    if (responseData?.currentPage != null) {
//                        currentPage = 1


                        if (currentPage == 1) {//first currentPage
                            searchList.addAll(responseData.items as List<SearchModel.Item>)
                            searchAdapter.notifyDataChanged()
                            if (responseData.items.isEmpty())
                                MyDialogUty.showInfoDialog(
                                    context = this,
                                    myDialogCallback = null,
                                    action = "",
                                    title = "Empty Data in Response!",
                                    message = "Please Try again.",
                                    positive = getString(android.R.string.yes)
                                )
                        } else {//load more second currentPage
                            //remove loading view
                            if (searchList.isNotEmpty())
                                searchList.removeAt(searchList.size - 1)

                            searchList.addAll(responseData.items as List<SearchModel.Item>)
                            if (responseData.items.isEmpty()) {
                                searchAdapter.setMoreDataAvailable(false)
                            }
//                            if (responseData.data?.size ?: 0 != 0) {
//                                //add loaded data
//                                searchList.addAll(responseData.data as List<SearchModel.Data>)
//                            } else {
//                            //MyApp.showToast("No More.")
//                                searchAdapter.setMoreDataAvailable(false)
//                            }//old
                            searchAdapter.notifyDataChanged()
                        }
                    currentPage++
//                    }
                }, { error ->
                    var errorTitle = ""
                    var errorMessage = error.message.toString()
                    when (error) {
                        is SocketTimeoutException -> {
                            errorTitle = "Socket Time Out Exception"
                        }
                        is ConnectException -> {
                            errorTitle = "Connect Exception"
                        }
                        is HttpException -> {
                            errorTitle = "Http Exception ${error.response()?.code().toString()}"
//                            if (error.response()?.code() == 422) {
//                                val responseBody = error.response()?.errorBody()
//                                val jsonObject = JSONObject(responseBody?.string())
//                                message = jsonObject.getString("error")
//                            }
                        }
                    }
                    this?.let {
                        MyDialogUty.showInfoDialog(
                            context = it,
                            myDialogCallback = null,
                            action = "",
                            title = errorTitle,
                            message = errorMessage,
                            positive = getString(android.R.string.yes)
                        )
                    }
                })
        )


    }
}