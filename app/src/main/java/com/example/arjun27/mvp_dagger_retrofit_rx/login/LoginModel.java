package com.example.arjun27.mvp_dagger_retrofit_rx.login;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginActvityMVP;
import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginRepository;

/**
 * Created by arjun27 on 4/17/2018.
 */

public class LoginModel implements LoginActvityMVP.Model {

    LoginRepository loginRepository;

    public LoginModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void createUser(String firstname, String lastname) {
        loginRepository.saveuser(new User(firstname,lastname));

    }

    @Override
    public User getUser() {
        return loginRepository.getuser();
    }
}
