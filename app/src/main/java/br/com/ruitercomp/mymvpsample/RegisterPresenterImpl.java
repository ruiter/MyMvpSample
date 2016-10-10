package br.com.ruitercomp.mymvpsample;


/**
 * Created by ruiter on 10/10/16.
 */

public class RegisterPresenterImpl implements RegisterPresenter, RegisterInteractor.OnFinishedRegisterListener {

    private RegisterView registerView;
    private RegisterInteractor registerInteractor;

    public RegisterPresenterImpl(RegisterView registerView) {
        this.registerView = registerView;
        this.registerInteractor = new RegisterInteractorImpl();
    }

    @Override
    public void validateRegister(String name, String username, String password) {
        if (registerView != null) {
            registerView.showProgressBar();
        }

        registerInteractor.register(name, username, password, this);
    }

    @Override
    public void onDestroy() {
        registerView = null;
    }

    @Override
    public void onNameError() {
        if (registerView != null) {
            registerView.hideProgressBar();
            registerView.setNameError();
        }
    }

    @Override
    public void onUsernameError() {
        if (registerView != null) {
            registerView.hideProgressBar();
            registerView.setUsernameError();
        }
    }

    @Override
    public void onPasswordError() {
        if (registerView != null) {
            registerView.hideProgressBar();
            registerView.setPasswordError();
        }
    }

    @Override
    public void onSuccess() {
        if (registerView != null) {
            registerView.navigateToLogin();
        }
    }
}
