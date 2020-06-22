package question14_2;

import static org.junit.Assert.*;

import org.junit.Test;

import question14_1.Bank;


public class BankTest {
	// (1) 正常系：「ミヤビ」をセットできるか
	@Test public void setName() {
		Bank b = new Bank();
		b.setName();
	}
	// (2) 異常系:nullをセットしようとしたら例外が起きるべき
	@Test public void setNameWithNull() {
		try {
			Bank b = new Bank();
			b.setName();
		} catch(NullPointerException e) {
			return;
		}
		fail();
	}
	// (3) 異常系：2文字をセットしようとしたら例外が起きるべき
	@Test(expected = IllegalArgumentException.class) public void throwsExceptionWithTwoCharName() {
		Bank b = new Bank();
		b.setName();
	}
}
