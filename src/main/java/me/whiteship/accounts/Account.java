package me.whiteship.accounts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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

    private String email;

    @Column(unique = true)
    private String username;

    private String fullName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date joined;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

}
