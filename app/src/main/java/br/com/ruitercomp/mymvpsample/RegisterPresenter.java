package br.com.ruitercomp.mymvpsample;

/**
 * Created by ruiter on 10/10/16.
 */

public interface RegisterPresenter {

    void validateRegister(String name, String username, String password);

    void onDestroy();
}
