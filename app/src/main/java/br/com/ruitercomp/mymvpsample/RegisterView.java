package br.com.ruitercomp.mymvpsample;

/**
 * Created by ruiter on 10/10/16.
 */

public interface RegisterView {

    void showProgressBar();

    void hideProgressBar();

    void setNameError();

    void setUsernameError();

    void setPasswordError();

    void navigateToLogin();
}
