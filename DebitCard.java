/**
 * Write a description of class BankCard here.
 *
 * @author (22068096 Aayush Katwal)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber){
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    //accessor
    public int getPinNumber(){
        return this.pinNumber;
    }
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn(){
        return this.hasWithdrawn;
    }
    //mutator / setter
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        if (pinNumber == this.pinNumber && withdrawalAmount <= getBalanceAmount()){
            this.withdrawalAmount = withdrawalAmount;
            this.hasWithdrawn = true;
            this.dateOfWithdrawal = dateOfWithdrawal;
            setBalanceAmount(getBalanceAmount() - withdrawalAmount);
        }
        else if(pinNumber != this.pinNumber){
            System.out.println("Wrong PIN number. Please enter correct PIN number.");
        }
        else{
            //checks for withdrawalAmount
            System.out.println("Insufficient Balance. Please check your account balance or withdrawal amount.");
        }
    }
    
    public void display(){
        super.display();
        if(hasWithdrawn == true){
            System.out.println("PIN Number: " + pinNumber);
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);   
        }
        //balance amount is already displayed from BankCard class.
    }
    
    
    
    
}