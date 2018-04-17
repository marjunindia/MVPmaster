package com.example.arjun27.mvp_dagger_retrofit_rx.login;

/**
 * Created by arjun27 on 4/17/2018.
 */

public class User {
    private int id;
    private String firstname;
    private String lastname;

    public User( String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
