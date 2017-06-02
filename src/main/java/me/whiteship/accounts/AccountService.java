package me.whiteship.accounts;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by tyson on 2017-05-27.
 */
@RestController
@Transactional
public class AccountService {


    @Autowired
    private AccountRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Account createAccount(AccountDto.Create dto){
//        Account account = new Account();
//        account.setUserName(dto.getUsername());
//        account.setPassword(dto.getPassword());
        Account account = modelMapper.map(dto, Account.class);

        Date now = new Date();
        account.setJoined(now);
        account.setUpdated(now);
        return repository.save(account);
    }
}
