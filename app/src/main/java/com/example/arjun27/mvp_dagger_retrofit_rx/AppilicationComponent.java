package com.example.arjun27.mvp_dagger_retrofit_rx;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arjun27 on 4/16/2018.
 */

@Singleton
@Component(modules = AppilicationModule.class)
public interface AppilicationComponent {

    void inject(LoginActivity target);


}
