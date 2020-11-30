package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {

    @Test
    void deposit_Less_Than_50000_Per_Day_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float depositCash1 = 1000.00f;
        float depositCash2 = 10000.00f;
        float depositCash3 = 15000.00f;

        Agent agent = new Agent();

        boolean actualResult =  agent.CheckDepositPerDay(depositCash1);
        assertEquals(expectedResult,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash2);
        assertEquals(expectedResult,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash3);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equals_50000_Per_Day_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float depositCash1 = 10000.00f;
        float depositCash2 = 15000.00f;
        float depositCash3 = 25000.00f;

        Agent agent = new Agent();

        boolean actualResult =  agent.CheckDepositPerDay(depositCash1);
        assertEquals(expectedResult,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash2);
        assertEquals(expectedResult,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash3);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_More_Than_50000_Per_Day_Result_Should_Be_False(){
        Boolean expectedResult_True = true;
        Boolean expectedResult_False = false;
        float depositCash1 = 10000.00f;
        float depositCash2 = 10000.00f;
        float depositCash3 = 45000.00f;

        Agent agent = new Agent();

        boolean actualResult =  agent.CheckDepositPerDay(depositCash1);
        assertEquals(expectedResult_True,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash2);
        assertEquals(expectedResult_True,actualResult);
        actualResult =  agent.CheckDepositPerDay(depositCash3);
        assertEquals(expectedResult_False,actualResult);

    }
}