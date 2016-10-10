package br.com.ruitercomp.mymvpsample;

/**
 * Created by ruiter on 10/10/16.
 */

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();
}
