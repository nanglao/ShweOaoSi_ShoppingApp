package com.example.shweoaosi_shoppingapp.mockitotest

import android.util.Log
import io.reactivex.Observable
import io.reactivex.Observable.fromCallable
import java.util.concurrent.TimeUnit

class LoginRepository {

    fun login(login: String, password: String): Observable<Boolean> {
        Log.d("debug", "login $login with password $password")

        return fromCallable { CORRECT_LOGIN == login && CORRECT_PASSWORD == password }
                .delay(2000, TimeUnit.MILLISECONDS)
    }

    companion object {
        internal val CORRECT_LOGIN = "dbacinski"
        internal val CORRECT_PASSWORD = "correct"
    }
}
