package me.whiteship;

import me.whiteship.accounts.Account;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AmugonaApplicationTests {

	@Test
	public void getterSetter() {
		Account account = new Account();
		account.setLoginId("whiteship");
		account.setPassword("password");
		assertThat(account.getLoginId(), is("whiteship"));

	}

}
