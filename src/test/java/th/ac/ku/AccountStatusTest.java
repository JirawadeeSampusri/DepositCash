package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStatusTest{

    @Test
    void check_Valid_User_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        Account account = new Account(true);
        String accountNumber = "2573956446";

        boolean actualResult = account.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }

    @Test
    void check_Invalid_User_Account_Result_Should_Be_False(){
        boolean expectedResult = false;
        Account account = new Account(false);
        String accountNumber = "123456789";

        boolean actualResult = account.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }
}
