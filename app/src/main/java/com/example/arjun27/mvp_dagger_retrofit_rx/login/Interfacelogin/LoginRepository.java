package com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.User;

/**
 * Created by arjun27 on 4/17/2018.
 */

public interface LoginRepository {

    User getuser();
    void saveuser(User user);
}
