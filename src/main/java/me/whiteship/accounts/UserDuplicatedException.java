package me.whiteship.accounts;

/**
 * Created by tyson on 2017-06-02.
 */
public class UserDuplicatedException extends RuntimeException {

    String username;

    public UserDuplicatedException(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
