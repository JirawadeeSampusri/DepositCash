package th.ac.ku;

import java.util.Arrays;

public class Account {
    private String[] validAccountList = {"7563956391", "365916394"};

    private final boolean accountStatus;

    public Account(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    public  boolean checkSuspendedAccount(String accountNumber){
        return Arrays.stream(this.validAccountList).anyMatch(accountNumber::equals);
    }

}