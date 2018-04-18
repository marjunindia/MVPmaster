package com.example.arjun27.mvp_dagger_retrofit_rx;

import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginActvityMVP;
import com.example.arjun27.mvp_dagger_retrofit_rx.login.LoginActivityPresenter;
import com.example.arjun27.mvp_dagger_retrofit_rx.login.User;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by arjun27 on 4/18/2018.
 */

public class PresenterTest {

    LoginActvityMVP.Model mockModel;
    LoginActvityMVP.View mockView;
    LoginActivityPresenter presenter;
    User user;

    @Before
    public void setUp() throws Exception {

        mockModel=mock(LoginActvityMVP.Model.class);

        user=new User("fox","mulder");

        when(mockModel.getUser()).thenReturn(user);

        mockView=mock(LoginActvityMVP.View.class);

        presenter=new LoginActivityPresenter(mockView);

        presenter.setView(mockView);


    }




}
