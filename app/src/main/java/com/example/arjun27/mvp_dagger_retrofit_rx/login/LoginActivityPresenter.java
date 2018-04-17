package com.example.arjun27.mvp_dagger_retrofit_rx.login;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginActvityMVP;

/**
 * Created by arjun27 on 4/17/2018.
 */

public class LoginActivityPresenter implements LoginActvityMVP.Presenter {



    LoginActvityMVP.View view;

    LoginActvityMVP.Model model;


    public LoginActivityPresenter(LoginActvityMVP.View view) {
        this.view = view;
        this.model = new LoginModel(new MemoryRepository());
    }


    @Override
    public void setView(LoginActvityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {

        if (view != null) {
            if (view.getFirstname().trim().equals("") || view.getLastnmae().trim().equals("")) {
                view.showInputError();
            } else {
                model.createUser(view.getFirstname(), view.getLastnmae());
                view.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user == null) {
            if (view != null) {
                view.showUsernotAvailable();
            }
        } else {
            if (view != null) {
                view.setFirstname(user.getFirstname());
                view.setLastname(user.getLastname());
            }
        }


    }
}
