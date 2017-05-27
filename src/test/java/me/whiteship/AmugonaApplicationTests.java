package me.whiteship;

import me.whiteship.accounts.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmugonaApplicationTests {

	@Test
	public void getterSetter() {
		Account account = new Account();
		account.setLoginId("whiteship");
		account.setPassword("password");
		assertThat(account.getLoginId(), is("whiteship"));
	}

}
