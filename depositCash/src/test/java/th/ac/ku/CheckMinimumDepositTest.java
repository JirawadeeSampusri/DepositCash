package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckMinimumDepositTest {

    @Test
    void deposit_Less_Than_Minimum_Deposit_Should_Return_False() {

        Boolean expectedResult = false;
        float depositCash = 90.00f;

        Agent agent = new Agent();

        Boolean actualResult = agent.CheckMinimumDeposit(depositCash);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_Equals_Minimum_Deposit_Should_Return_True() {

        Boolean expectedResult = true;
        float depositCashAmount = 100.00f;

        Agent agent = new Agent();

        Boolean actualResult = agent.CheckMinimumDeposit(depositCashAmount);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_More_Than_Minimum_Deposit_Should_Return_True() {

        Boolean expectedResult = true;
        float depositCashAmount = 300.00f;

        Agent agent = new Agent();

        Boolean actualResult = agent.CheckMinimumDeposit(depositCashAmount);
        assertEquals(expectedResult, actualResult);

    }
}
