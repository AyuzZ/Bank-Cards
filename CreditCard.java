
/**
 * Write a description of class BankCard here.
 *
 * @author (22068096 Aayush Katwal)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate){
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //accessor
    public int getCVCNumber(){
        return this.cvcNumber;
    }
    public double getCreditLimit(){
        return this.creditLimit;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public String getExpirationDate(){
        return this.expirationDate;
    }
    public int getGracePeriod(){
        return this.gracePeriod;
    }
    public boolean getIsGranted(){
        return this.isGranted;
    }
    
    public void creditLimit(double newCreditLimit, int newGracePeriod){
        if(newCreditLimit <= 2.5 * getBalanceAmount()){
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            this.isGranted = true;
        }
        else{
            System.out.println("Credit cannot be issued. Limit must be equal to or less than 2.5 times the balance amount. Please check your balance amount.");
        }
    }
    
    public void cancelCreditCard(){
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    public void display(){
        super.display();
        System.out.println("CVC number " + cvcNumber);
        System.out.println("Interest Rate " + interestRate);
        System.out.println("Expiration Date " + expirationDate);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Grace Period: " + gracePeriod);
    }
}
