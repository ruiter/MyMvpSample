package br.com.ruitercomp.mymvpsample;


/**
 * Created by ruiter on 10/10/16.
 */

public class RegisterPresenterImpl implements RegisterPresenter {

    private RegisterView registerView;

    public RegisterPresenterImpl(RegisterView registerView) {
        this.registerView = registerView;
    }

    @Override
    public void validateRegister(String name, String username, String password) {

    }

    @Override
    public void onDestroy() {

    }
}
