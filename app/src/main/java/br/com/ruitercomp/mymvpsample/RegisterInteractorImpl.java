package br.com.ruitercomp.mymvpsample;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by ruiter on 10/10/16.
 */

public class RegisterInteractorImpl implements RegisterInteractor{

    @Override
    public void register(final String name, final String username, final String password, final OnFinishedRegisterListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(name)) {
                    listener.onNameError();
                    error = true;
                } else if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                } else if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                } else if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
