package me.whiteship.accounts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by oolong on 2017-05-25.
 */
@Entity
@Getter
@Setter
public class Account {

    @Id @GeneratedValue
    private long id;

    private String loginId;

    private String password;

}
