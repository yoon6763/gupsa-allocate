package com.gupsa.allocate

import android.app.Activity
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

open class ParentActivity : AppCompatActivity() {
    var progressDialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)
    }

    fun showProgress(activity: Activity, text: String) {
        if (progressDialog != null) progressDialog = null

        progressDialog = Dialog(activity)
        progressDialog?.setContentView(R.layout.dialog_progress)
        progressDialog?.findViewById<TextView>(R.id.tv_dialog_progress)?.text = text
        progressDialog?.setCancelable(false) // 다이얼로그 외 터치 시 취소 막음
        progressDialog?.show()
    }

    fun hideProgress() {
        if (progressDialog != null) {
            progressDialog?.dismiss()
        }
        progressDialog = null
    }

    fun showShortToast(msg: String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }

    fun showShortToast(resId: Int) {
        Toast.makeText(applicationContext, getString(resId), Toast.LENGTH_SHORT).show()
    }
}