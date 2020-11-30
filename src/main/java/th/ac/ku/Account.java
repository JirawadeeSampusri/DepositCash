package th.ac.ku;

import java.util.Arrays;

public class Account {
    private String[] validAccountList = {"25739564461", "1233333456"};

    private final boolean accountStatus;

    public Account(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    public  boolean checkSuspendedAccount(String accountNumber){
        return Arrays.stream(this.validAccountList).anyMatch(accountNumber::equals);
    }

}