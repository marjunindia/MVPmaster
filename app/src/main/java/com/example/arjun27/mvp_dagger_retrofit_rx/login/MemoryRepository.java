package com.example.arjun27.mvp_dagger_retrofit_rx.login;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginRepository;

/**
 * Created by arjun27 on 4/17/2018.
 */

public class MemoryRepository implements LoginRepository {

    User user;


    @Override
    public User getuser() {
        if (user == null) {

            User user = new User("Fox", "Mulder");
            user.setId(0);
            return user;
        } else {
            return user;

        }
    }

    @Override
    public void saveuser(User user) {
        this.user = user;
        if (user == null) {
            user = getuser();

        }
    }
}
