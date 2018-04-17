package com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.User;

/**
 * Created by arjun27 on 4/17/2018.
 */

public interface LoginActvityMVP {

    interface View{

        String getFirstname();

        String getLastnmae();

        void showUsernotAvailable();

        void showUserSavedMessage();

        void showInputError();


        void setFirstname(String fname);

        void setLastname(String lname);

    }
    interface Presenter{

        void setView(LoginActvityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();

    }
    interface Model{

        void createUser(String firstname,String lastname);

        User getUser();

    }

}
