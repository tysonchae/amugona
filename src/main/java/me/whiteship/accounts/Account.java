package me.whiteship.accounts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by oolong on 2017-05-26.
 */
@Entity
@Setter
@Getter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String loginId;

    private String password;


}
