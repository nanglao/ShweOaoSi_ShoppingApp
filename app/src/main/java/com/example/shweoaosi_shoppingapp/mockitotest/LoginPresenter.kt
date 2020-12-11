package com.example.shweoaosi_shoppingapp.mockitotest

import com.example.shweoaosi_shoppingapp.R

class LoginPresenter(private val resourceProvider: ResourceProvider, private val loginValidator: LoginValidator, private val loginUseCase: LoginUseCase, private val schedulersFactory: SchedulersFactory) : BasePresenter<LoginView>() {

    fun attemptLogin(loginCredentials: LoginCredentials) {
        if (!validateInputs(loginCredentials)) {
            return
        }

        view?.showProgress()
        loginUseCase.loginWithCredentialsWithStatus(loginCredentials)
                .compose(schedulersFactory.createMainThreadSchedulerTransformer())
                .subscribe { success ->
                    view?.hideProgress()

                    if (success) {
                        view?.onLoginSuccessful()
                    } else {
                        view?.showPasswordError(resourceProvider.getString(R.string.error_incorrect_password))
                        view?.requestPasswordFocus()
                    }
                }
    }

    private fun validateInputs(loginCredentials: LoginCredentials): Boolean {
        val validateLogin = validateLogin(loginCredentials)
        return validatePassword(loginCredentials) && validateLogin //XXX validateLogin is not inlined to avoid short circuit check
    }

    private fun validateLogin(loginCredentials: LoginCredentials): Boolean =
            if (loginValidator.validateLogin(loginCredentials.login)) {
                view?.showLoginError(null)
                true
            } else {
                view?.showLoginError(resourceProvider.getString(R.string.error_field_required))
                view?.requestLoginFocus()
                false
            }

    private fun validatePassword(loginCredentials: LoginCredentials): Boolean =
            if (loginValidator.validatePassword(loginCredentials.password)) {
                view?.showPasswordError(null)
                true
            } else {
                view?.showPasswordError(resourceProvider.getString(R.string.error_invalid_password))
                view?.requestPasswordFocus()
                false
            }
}
