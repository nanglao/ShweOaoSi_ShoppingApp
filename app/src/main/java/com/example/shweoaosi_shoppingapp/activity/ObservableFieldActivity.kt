
package com.example.shweoaosi_shoppingapp.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt

class ObservableFieldActivity : AppCompatActivity() {

    private val observableFieldProfile = ObservableFieldProfile("Ada", "Lovelace", ObservableInt(0))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ObservableFieldProfileBinding =
                DataBindingUtil.setContentView(this, R.layout.observable_field_profile)
        binding.user = observableFieldProfile
    }

    /**
     * This method is triggered by the `android:onclick` attribute in the layout. It puts business
     * logic in the activity, which is not ideal. See {@link ViewModelActivity} for a better
     * solution.
     */
    fun onLike(view: View) {
        observableFieldProfile.likes.set(observableFieldProfile.likes.get() + 1)
    }
}
