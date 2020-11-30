package th.ac.ku;

public class Agent {

    private float depositPerTime = 30000.00f;
    private float depositPerDay = 50000.00f;
    private float minimumDeposit = 100.00f;
    private float Deposit = 0;


    public boolean CheckDepositPerDay(float amount){
        Deposit += amount;
        return Deposit <= depositPerDay;
    }

    public boolean CheckMinimumDeposit(float amount){
        return minimumDeposit <= amount ;
    }


    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= depositPerTime;
    }
}