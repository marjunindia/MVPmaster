package com.example.arjun27.mvp_dagger_retrofit_rx;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arjun27 on 4/16/2018.
 */

@Module
public class AppilicationModule {

    //keep track of dependencies

    private Application application;

    public AppilicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
