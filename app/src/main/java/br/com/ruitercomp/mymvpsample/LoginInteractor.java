package br.com.ruitercomp.mymvpsample;

/**
 * Created by ruiter on 10/10/16.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
