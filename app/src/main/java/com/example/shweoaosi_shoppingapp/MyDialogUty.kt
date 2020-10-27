package com.example.shweoaosi_shoppingapp

import android.app.Activity
import android.content.Context
import android.os.Build
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog


object MyDialogUty {
    interface MyDialogCallback<T> {
        fun myDialogCallback(action: T, pressOk: Boolean, requireData: T?)
    }

    interface MyDialogCallback2<T> {
        fun myDialogCallback(action: T, pressOk: Boolean, requireData1: T?, requireData2: T?)
    }

    fun alertDialogDefault(
        activity: Activity, myDialogCallback: MyDialogCallback<String>, action: String,
        title: String, message: String
    ) {
        val builder: AlertDialog.Builder =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AlertDialog.Builder(activity, R.style.MyAppCompatDialog)
            } else {
                AlertDialog.Builder(activity)
            }
        builder.setTitle(title)
            .setCancelable(false)
            .setMessage(message)
            .setPositiveButton(android.R.string.yes) { dialog, _ ->
                dialog.dismiss()
                myDialogCallback.myDialogCallback(action, true, null)
            }
            .setNegativeButton(android.R.string.no) { dialog, _ ->
                dialog.dismiss()
            }
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()
    }

    fun alertDialogNetworkDefaultOK(
        activity: Activity, myDialogCallback: MyDialogCallback<String>?, action: String?,
        title: String, message: String
    ) {
        val builder: AlertDialog.Builder =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            AlertDialog.Builder(activity, R.style.MyAppCompatDialog)
                AlertDialog.Builder(activity)
            } else {
                AlertDialog.Builder(activity)
            }
        builder.setTitle(title)
            .setCancelable(false)
            .setMessage(message)
            .setPositiveButton(android.R.string.yes) { dialog, _ ->
                dialog.dismiss()
                myDialogCallback?.myDialogCallback(action.toString(), true, null)
            }
//            .setIcon(R.drawable.baseline_cloud_off_24)
            .show()
    }

    fun showInfoDialog(
        context: Context, myDialogCallback: MyDialogCallback<String>?, action: String,
        title: String,
        message: String,
        positive: String
    ) {
        val dialog = AppCompatDialog(context, R.style.MyAppCompatDialog)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_info_positive)
        val tvTitle = dialog.findViewById<TextView>(R.id.tvTitle)
        tvTitle?.text = title
        val tvMessage = dialog.findViewById<TextView>(R.id.tvMessage)
        tvMessage?.text = message
        val btnPositive = dialog.findViewById<Button>(R.id.btnPositive)
        btnPositive?.text = positive
        btnPositive?.setOnClickListener {
            myDialogCallback?.myDialogCallback(action, true, null)
            dialog.dismiss()
        }
        dialog.show()
    }

    fun showLoadingDialog(context: Context): AppCompatDialog {
        val dialog = AppCompatDialog(context, R.style.MyAppCompatLoadingDialog)
//        dialog.window.setBackgroundDrawableResource(android.R.color.transparent)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_loading)
        dialog.show()
        return dialog
    }
}
