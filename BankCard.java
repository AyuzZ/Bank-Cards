
/**
 * Write a description of class BankCard here.
 *
 * @author (22068096 Aayush Katwal)
 * @version (1.0.0)
 */
public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    //constructor
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank){
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    
    //accessor method (getter)
    public int getCardId(){
        return this.cardId;
    }
    public String getClientName(){
        return this.clientName = "";
    }
    public String getIssuerBank(){
        return this.issuerBank;
    }
    public String getBankAccount(){
        return this.bankAccount;
    }
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    
    //setter
    public void setClientName(String newClientName){
        clientName = newClientName;
    }
    public void setBalanceAmount(double newBalanceAmount){
        balanceAmount = newBalanceAmount;
    }
    
    public void display(){
        //if (clientName.equals(""))
        if (clientName == ""){
            System.out.println("Client name is not assigned.");
        }
        else{
            System.out.println("Card Id: " + cardId);
            System.out.println("Client Name: " + clientName);
            System.out.println("Issuer Bank: " + issuerBank);
            System.out.println("Bank Account: " + bankAccount);
            System.out.println("Balance Amount: " + balanceAmount);
        }
        
    }
}
