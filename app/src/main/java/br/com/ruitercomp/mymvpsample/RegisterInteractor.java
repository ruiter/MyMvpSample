package br.com.ruitercomp.mymvpsample;

/**
 * Created by ruiter on 10/10/16.
 */

public interface RegisterInteractor {

    interface OnFinishedRegisterListener {
        void onNameError();

        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void register(String name, String username, String password, OnFinishedRegisterListener listener);
}
