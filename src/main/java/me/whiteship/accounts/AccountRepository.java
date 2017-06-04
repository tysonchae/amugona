package me.whiteship.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tyson on 2017-05-27.
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    Account findByUsername(String username);
}
