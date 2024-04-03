import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;

public class BankGUI implements ActionListener{
    //declaring all the attributes
    private ArrayList<BankCard> cards;

    //GUI Components
    //Common Attributes
    private JFrame myFrame;
    private JTextField cardIdTxt, clientNameTxt, balanceAmountTxt, issuerBankTxt, bankAccountTxt;
    private JLabel BankAccountDetailsLbl, cardIdLbl, clientNameLbl, balanceAmountLbl, issuerBankLbl, bankAccountLbl;
    private JButton clearAllBtn;

    //Debit Card Specific Attributes
    private JLabel DebitCardLbl;
    //Add Debit Card
    private JLabel pinNumberLbl;
    private JTextField pinNumberTxt;
    private JButton addDebitCardBtn;
    //Withdraw From Debit Card
    private JLabel withdrawLbl, dCardIdLbl, withdrawalAmountLbl, withdrawalDateLbl, wPinNumberLbl;
    private JTextField dCardIdTxt, withdrawalAmountTxt, wPinNumberTxt;
    private JComboBox wDrawYearComboBox, wDrawMonthComboBox, wDrawDayComboBox;
    private JButton withdrawBtn, displayDebitCardBtn;

    //Credit Card Specific Attributes
    private JLabel CreditCardLbl;
    //Add Credit Card
    private JLabel cvcNumberLbl, interestRateLbl, expirationDateLbl;
    private JTextField cvcNumberTxt, interestRateTxt;
    private JComboBox expYearComboBox, expMonthComboBox, expDayComboBox;
    private JButton addCreditCardBtn;
    //Credit Limit
    private JLabel setCreditLimitLbl, cCardIdLbl, creditLimitLbl, gracePeriodLbl;
    private JTextField cCardIdTxt, creditLimitTxt, gracePeriodTxt;
    private JButton setCreditLimitBtn, displayCreditCardBtn, cancelCreditCardBtn;

    public BankGUI(){
        myFrame = new JFrame("Bank Account");
        cards = new ArrayList<BankCard>();
        //Common Attributes
        BankAccountDetailsLbl = new JLabel("Bank Account Details");
        cardIdLbl = new JLabel("Card Id");
        cardIdTxt = new JTextField();
        clientNameLbl = new JLabel("Client Name");
        clientNameTxt = new JTextField();
        balanceAmountLbl = new JLabel("Balance Amount");
        balanceAmountTxt = new JTextField();
        issuerBankLbl = new JLabel("Issuer Bank");
        issuerBankTxt = new JTextField();
        bankAccountLbl = new JLabel("Bank Account");
        bankAccountTxt = new JTextField();
        clearAllBtn = new JButton("Clear All");
        //DebitCard
        DebitCardLbl = new JLabel("Debit Card");
        //Add Debit Card
        pinNumberLbl = new JLabel("Pin Number");
        pinNumberTxt = new JTextField();
        addDebitCardBtn = new JButton("Add Debit Card");
        //Withdraw
        withdrawLbl = new JLabel("Withdraw");
        dCardIdLbl = new JLabel("Card Id");
        dCardIdTxt = new JTextField();
        withdrawalAmountLbl = new JLabel("Withdrawal Amount");
        withdrawalAmountTxt = new JTextField();
        withdrawalDateLbl = new JLabel("Withdrawal Date");
        wDrawYearComboBox = new JComboBox();
        wDrawMonthComboBox = new JComboBox();
        wDrawDayComboBox = new JComboBox();
        wPinNumberLbl = new JLabel("Pin Number");
        wPinNumberTxt = new JTextField();
        withdrawBtn = new JButton("Withdraw");
        displayDebitCardBtn = new JButton("Display");
        //CreditCard
        CreditCardLbl = new JLabel("Credit Card");
        //Add Credit Card
        cvcNumberLbl = new JLabel("CVC Number");
        cvcNumberTxt = new JTextField();
        interestRateLbl = new JLabel("Interest Rate");
        interestRateTxt = new JTextField();
        expirationDateLbl = new JLabel("Expiration Date");
        expYearComboBox = new JComboBox();
        expMonthComboBox = new JComboBox();
        expDayComboBox = new JComboBox();
        addCreditCardBtn = new JButton("Add Credit Card");
        //Credit Limit
        setCreditLimitLbl = new JLabel("Set Credit Limit");
        cCardIdLbl = new JLabel("Card Id");
        cCardIdTxt = new JTextField();
        creditLimitLbl = new JLabel("Credit Limit");
        creditLimitTxt = new JTextField();
        gracePeriodLbl = new JLabel("Grace Period");
        gracePeriodTxt = new JTextField();
        setCreditLimitBtn = new JButton("Set Credit Limit");
        displayCreditCardBtn = new JButton("Display");
        cancelCreditCardBtn = new JButton("Cancel Credit Card");     

        //Adding Items(Dates) in ComboBox
        for(int i = 1; i<=32; i++){
            wDrawDayComboBox.addItem(i);
            expDayComboBox.addItem(i);
        }
        for(int i = 1; i<=12; i++){
            wDrawMonthComboBox.addItem(i);
            expMonthComboBox.addItem(i);
        }
        for(int i = 1990; i<=2023; i++){
            wDrawYearComboBox.addItem(i);
        }
        for(int i = 2023; i<=2043; i++){
            expYearComboBox.addItem(i);
        }

        //Setting Bounds For All Components
        BankAccountDetailsLbl.setBounds(328, 80, 145, 24);
        cardIdLbl.setBounds(60, 130, 46, 20);
        cardIdTxt.setBounds(200, 125, 180, 30);
        clientNameLbl.setBounds(60, 170, 77, 20);
        clientNameTxt.setBounds(200, 165, 180, 30);
        balanceAmountLbl.setBounds(60, 210, 102, 20);
        balanceAmountTxt.setBounds(200, 205, 180, 30);
        issuerBankLbl.setBounds(420, 130, 74, 20);
        issuerBankTxt.setBounds(560, 125, 180, 30);
        bankAccountLbl.setBounds(420, 170, 86, 20);
        bankAccountTxt.setBounds(560, 165, 180, 30);
        clearAllBtn.setBounds(318, 720, 165, 30);
        //DebitCard
        DebitCardLbl.setBounds(60, 280, 91, 24);
        pinNumberLbl.setBounds(60, 320, 77, 20);
        pinNumberTxt.setBounds(200, 315, 180, 30);
        addDebitCardBtn.setBounds(215, 355, 165, 30);
        withdrawLbl.setBounds(60, 400, 69, 20);
        dCardIdLbl.setBounds(60, 440, 46, 20);
        dCardIdTxt.setBounds(200, 435, 180, 30);
        withdrawalAmountLbl.setBounds(60, 480, 121, 20);
        withdrawalAmountTxt.setBounds(200, 475, 180, 30);
        withdrawalDateLbl.setBounds(60, 520, 103, 20);
        wDrawYearComboBox.setBounds(200, 515, 60, 30);
        wDrawMonthComboBox.setBounds(265, 515, 60, 30);
        wDrawDayComboBox.setBounds(330, 515, 60, 30);
        wPinNumberLbl.setBounds(60, 560, 77, 20);
        wPinNumberTxt.setBounds(200, 555, 180, 30);
        withdrawBtn.setBounds(215, 595, 165, 30);
        displayDebitCardBtn.setBounds(215, 635, 165, 30);
        //CreditCard
        CreditCardLbl.setBounds(420, 280, 91, 24);
        cvcNumberLbl.setBounds(420, 320, 83, 20);
        cvcNumberTxt.setBounds(560, 315, 180, 30);
        interestRateLbl.setBounds(420, 360, 80, 20);
        interestRateTxt.setBounds(560, 355, 180, 30);
        expirationDateLbl.setBounds(420, 400, 96, 20);
        expYearComboBox.setBounds(560, 395, 60, 30);
        expMonthComboBox.setBounds(625, 395, 60, 30);
        expDayComboBox.setBounds(690, 395, 60, 30);
        addCreditCardBtn.setBounds(575, 435, 165, 30);
        setCreditLimitLbl.setBounds(420, 480, 110, 20);
        cCardIdLbl.setBounds(420, 520, 46, 20);
        cCardIdTxt.setBounds(560, 515, 180, 30);
        creditLimitLbl.setBounds(420, 560, 91, 20);
        creditLimitTxt.setBounds(560, 555, 180, 30);
        gracePeriodLbl.setBounds(420, 600, 91, 20);
        gracePeriodTxt.setBounds(560, 595, 180, 30);
        setCreditLimitBtn.setBounds(398, 635, 165, 30 );
        cancelCreditCardBtn.setBounds(575, 635, 165, 30);
        displayCreditCardBtn.setBounds(575, 675, 165, 30);

        //Beautifying the Components
        Color text_ = new Color(16,16,17);
        Color red_ = new Color(228,15,15);
        Color green_ = new Color(26,233,43);
        Color blue_ = new Color(36,111,243);
        Color cyan_ = new Color(12,176,242);
        addDebitCardBtn.setBackground(green_);
        addDebitCardBtn.setForeground(text_);
        addCreditCardBtn.setBackground(green_);
        addCreditCardBtn.setForeground(text_);
        displayDebitCardBtn.setBackground(cyan_);
        displayDebitCardBtn.setForeground(text_);
        displayCreditCardBtn.setBackground(cyan_);
        displayCreditCardBtn.setForeground(text_);
        cancelCreditCardBtn.setBackground(red_);
        cancelCreditCardBtn.setForeground(text_);
        setCreditLimitBtn.setBackground(blue_);
        setCreditLimitBtn.setForeground(text_);
        withdrawBtn.setBackground(blue_);
        withdrawBtn.setForeground(text_);
        clearAllBtn.setBackground(blue_);
        clearAllBtn.setForeground(text_);

        //Adding Components to the Frame
        myFrame.add(BankAccountDetailsLbl);
        myFrame.add(cardIdLbl);
        myFrame.add(cardIdTxt);
        myFrame.add(clientNameLbl);
        myFrame.add(clientNameTxt);
        myFrame.add(balanceAmountLbl);
        myFrame.add(balanceAmountTxt);
        myFrame.add(issuerBankLbl);
        myFrame.add(issuerBankTxt);
        myFrame.add(bankAccountLbl);
        myFrame.add(bankAccountTxt);
        myFrame.add(clearAllBtn);
        //Debit Card
        myFrame.add(DebitCardLbl);
        myFrame.add(pinNumberLbl);
        myFrame.add(pinNumberTxt);
        myFrame.add(addDebitCardBtn);
        myFrame.add(dCardIdLbl);
        myFrame.add(dCardIdTxt);
        myFrame.add(withdrawalAmountLbl);
        myFrame.add(withdrawalAmountTxt);
        myFrame.add(withdrawalDateLbl);
        myFrame.add(wDrawYearComboBox);
        myFrame.add(wDrawMonthComboBox);
        myFrame.add(wDrawDayComboBox);
        myFrame.add(wPinNumberLbl);
        myFrame.add(wPinNumberTxt);
        myFrame.add(withdrawBtn);
        myFrame.add(displayDebitCardBtn);
        //Credit Card
        myFrame.add(CreditCardLbl);
        myFrame.add(cvcNumberLbl);
        myFrame.add(cvcNumberTxt);
        myFrame.add(interestRateLbl);
        myFrame.add(interestRateTxt);
        myFrame.add(expirationDateLbl);
        myFrame.add(expYearComboBox);
        myFrame.add(expMonthComboBox);
        myFrame.add(expDayComboBox);
        myFrame.add(addCreditCardBtn);
        myFrame.add(cCardIdLbl);
        myFrame.add(cCardIdTxt);
        myFrame.add(creditLimitLbl);
        myFrame.add(creditLimitTxt);
        myFrame.add(gracePeriodLbl);
        myFrame.add(gracePeriodTxt);
        myFrame.add(setCreditLimitBtn);
        myFrame.add(displayCreditCardBtn);
        myFrame.add(cancelCreditCardBtn);

        //Adding actionListeners
        addDebitCardBtn.addActionListener(this);
        withdrawBtn.addActionListener(this);
        displayDebitCardBtn.addActionListener(this);
        addCreditCardBtn.addActionListener(this);
        setCreditLimitBtn.addActionListener(this);
        cancelCreditCardBtn.addActionListener(this);
        displayCreditCardBtn.addActionListener(this);
        clearAllBtn.addActionListener(this);

        myFrame.setSize(820,880);
        myFrame.setLayout(null);
        myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    //implement the method of the actionListener
    public void actionPerformed(ActionEvent e){
        //logic of the button functionality (event handling)

        //Adding Debit Card
        if(e.getSource() == addDebitCardBtn){
            //checking for empty slots
            if(balanceAmountTxt.getText().isEmpty() || cardIdTxt.getText().isEmpty() || bankAccountTxt.getText().isEmpty()
            || issuerBankTxt.getText().isEmpty() || clientNameTxt.getText().isEmpty() || pinNumberTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "Please Fill Out All The Necessary Fields.");
            }
            else{
                try{
                    //getting values from text fields
                    double balanceAmount = Integer.parseInt(balanceAmountTxt.getText());
                    int cardId = Integer.parseInt(cardIdTxt.getText());
                    String bankAccount = bankAccountTxt.getText();
                    String issuerBank = issuerBankTxt.getText();
                    String clientName = clientNameTxt.getText();
                    int pinNumber = Integer.parseInt(pinNumberTxt.getText());
                    boolean addCounter = false;

                    //if arrayList is empty
                    if(cards.isEmpty()){
                        //creating obj of debit card using the constructor
                        DebitCard debitObj = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                        //adding the obj to the arrayList
                        cards.add(debitObj);
                        addCounter = true;
                        JOptionPane.showMessageDialog(myFrame, "Debit Card Added");
                    }
                    else{
                        //checking if debitCard is already present
                        for(BankCard card : cards){
                            //checking if the card is a DebitCard or CreditCard
                            if (card instanceof DebitCard){
                                //if it is, downcasting the BankCard in the arrayList to DebitCard
                                DebitCard debitCard = (DebitCard)card;
                                //cardId must be unique
                                if (debitCard.getCardId() == cardId){
                                    addCounter = true;
                                    JOptionPane.showMessageDialog(myFrame, "CardID already Exists. Check your CardId.");
                                    break;
                                }
                            }
                        }
                        if (addCounter == false){
                            DebitCard debitObj = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                            cards.add(debitObj);
                            JOptionPane.showMessageDialog(myFrame, "Debit Card Added here");
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(myFrame, "Enter Correct Values.");
                }
            }
        }

        //withdrawBtn
        if(e.getSource() == withdrawBtn){
            if(dCardIdTxt.getText().isEmpty() || withdrawalAmountTxt.getText().isEmpty() || wPinNumberTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "Please Fill Out All The Necessary Fields.");
            }
            else{
                try{
                    //getting values from text fields
                    int cardId = Integer.parseInt(dCardIdTxt.getText());
                    int withdrawalAmount = Integer.parseInt(withdrawalAmountTxt.getText());
                    String year = wDrawYearComboBox.getSelectedItem().toString();
                    String month = wDrawMonthComboBox.getSelectedItem().toString();
                    String day = wDrawDayComboBox.getSelectedItem().toString();
                    String dateOfWithdrawal = year+"-"+month+"-"+day;
                    int pinNumber = Integer.parseInt(wPinNumberTxt.getText());
                    //if arrayList is empty
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(myFrame, "ArrayList Is Empty. Please Enter Debit Cards Before Withdrawing.");
                    }
                    else{
                        boolean debitCardCounter = false;
                        boolean cardIdMatch = false;
                        //using for loop in arrayList
                        for(BankCard card : cards){
                            //checking if the card is a debitCard or not
                            if (card instanceof DebitCard){
                                debitCardCounter = true;
                                DebitCard debitCard = (DebitCard)card; //downcasting BankCard to DebitCard
                                if(debitCard.getCardId() == cardId){
                                    cardIdMatch = true;
                                    if(debitCard.getPinNumber() == pinNumber){
                                        if(debitCard.getBalanceAmount() >= withdrawalAmount){
                                            debitCard.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber); //calling withdraw method of DebitCard
                                            JOptionPane.showMessageDialog(myFrame, "Given Amount is Withdrawn.");
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(myFrame, "Insufficient Balance. Please check your account balance or withdrawal amount.");
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(myFrame, "Wrong PIN Number.");
                                    }
                                }
                            }
                        }
                        if (debitCardCounter == false){
                            JOptionPane.showMessageDialog(myFrame, "ArrayList Doesn't Contain Any Debit Cards. Please Enter New Debit Cards Before Withdrawing.");
                        }
                        if (debitCardCounter && cardIdMatch == false){
                            JOptionPane.showMessageDialog(myFrame, "Given CardId doesn't match. Please Enter Valid CardId.");
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(myFrame, "Enter Correct Values.");
                }
            }
        }

        //displayDebit Card
        if(e.getSource() == displayDebitCardBtn){
            //if arrayList is empty
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "ArrayList Is Empty. Please Enter New Cards Before Displaying.");
            }
            else{
                boolean debitCardCounter = false;
                //using for loop in arrayList
                for(BankCard card : cards){
                    //checking if the card is a debitCard or not
                    if (card instanceof DebitCard){
                        debitCardCounter = true;
                        DebitCard debitCard = (DebitCard)card;
                        debitCard.display();
                    }
                }
                if (debitCardCounter == false){
                    JOptionPane.showMessageDialog(myFrame, "ArrayList Doesn't Contain Any Debit Cards. Please Enter New Debit Cards Before Displaying."); 
                }
            }
        }

        //Adding Credit Card
        if(e.getSource() == addCreditCardBtn){
            if(cardIdTxt.getText().isEmpty() || clientNameTxt.getText().isEmpty() || issuerBankTxt.getText().isEmpty() ||  bankAccountTxt.getText().isEmpty()
            || balanceAmountTxt.getText().isEmpty() || cvcNumberTxt.getText().isEmpty() || interestRateTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "Please Fill Out All The Necessary Fields.");
            }
            else{
                try{
                    //getting values from text fields
                    int cardId = Integer.parseInt(cardIdTxt.getText());
                    String clientName = clientNameTxt.getText();
                    String issuerBank = issuerBankTxt.getText();
                    String bankAccount = bankAccountTxt.getText();
                    double balanceAmount = Integer.parseInt(balanceAmountTxt.getText());
                    int cvcNumber = Integer.parseInt(cvcNumberTxt.getText());
                    double interestRate = Integer.parseInt(interestRateTxt.getText());
                    String year = (expYearComboBox.getSelectedItem()).toString();
                    String month = (expMonthComboBox.getSelectedItem()).toString();
                    String day = (expDayComboBox.getSelectedItem()).toString();
                    String expirationDate = year+"-"+month+"-"+day;
                    boolean addCounter = false;
                    //if arrayList is empty
                    if(cards.isEmpty()){
                        //creating obj of credit card using the constructor
                        CreditCard creditObj = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                        //adding to the arrayList
                        cards.add(creditObj);
                        addCounter = true;
                        JOptionPane.showMessageDialog(myFrame, "Credit Card Added");
                    }
                    else{
                        //using for loop in arrayList
                        for(BankCard card : cards){
                            //checking if the card is a debitCard or not
                            if (card instanceof CreditCard){
                                CreditCard creditCard = (CreditCard)card; //downcasting from BankCard to CreditCard
                                if (creditCard.getCardId() == cardId){
                                    addCounter = true;
                                    JOptionPane.showMessageDialog(myFrame, "CardID already Exists. Check you CardId.");
                                    break;
                                }                         
                            }
                        }
                        if (addCounter == false){
                            CreditCard creditObj = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                            cards.add(creditObj);
                            JOptionPane.showMessageDialog(myFrame, "Credit Card Added");
                        }
                    } 
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(myFrame, "Enter Correct Values.");
                }
            }
        }

        //displayCredit Card
        if(e.getSource() == displayCreditCardBtn){
            //if arrayList is empty
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "ArrayList Is Empty. Please Enter New Cards Before Displaying.");
            }
            else{
                //using for loop in arrayList
                boolean creditCardCounter = false;
                for(BankCard card : cards){
                    //checking if the card is a creditCard or not
                    if (card instanceof CreditCard){
                        creditCardCounter = true;
                        CreditCard creditCard = (CreditCard)card; //downcasting from BankCard to CreditCard
                        creditCard.display();
                    }
                }
                if (creditCardCounter == false){
                    JOptionPane.showMessageDialog(myFrame, "ArrayList Doesn't Contain Any Credit Cards. Please Enter New Credit Cards Before Canceling."); 
                }
            }
        }

        //set CreditLimit
        if(e.getSource() == setCreditLimitBtn){
            if(cCardIdTxt.getText().isEmpty() || creditLimitTxt.getText().isEmpty() || gracePeriodTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "Please Fill Out All The Necessary Fields.");
            }
            else{
                try{
                    //getting values from text fields
                    int cardId = Integer.parseInt(cCardIdTxt.getText());
                    double newCreditLimit = Integer.parseInt(creditLimitTxt.getText());
                    int newGracePeriod = Integer.parseInt(gracePeriodTxt.getText());
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(myFrame, "ArrayList Is Empty. Please Enter New Credit Card Before Setting Credit Limit.");
                    }
                    else{
                        boolean creditCardCounter = false;
                        boolean cardIdMatch = false;
                        //using for loop in arrayList
                        for(BankCard card : cards){
                            //checking if the card is a creditCard or not
                            if (card instanceof CreditCard){
                                creditCardCounter = true;
                                CreditCard creditCard = (CreditCard)card; //downcasting from BankCard to CreditCard
                                if(creditCard.getCardId() == cardId){
                                    cardIdMatch = true;
                                    if(newCreditLimit <= (creditCard.getBalanceAmount() * 2.5)){
                                        creditCard.creditLimit(newCreditLimit, newGracePeriod);
                                        JOptionPane.showMessageDialog(myFrame, "Credit Limit Set.");
                                        break;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(myFrame, "Credit cannot be issued. Limit must be equal to or less than 2.5 times the balance amount. Please check your balance amount.");
                                        break;
                                    }
                                }
                            }
                        }
                        if (creditCardCounter == false){
                            JOptionPane.showMessageDialog(myFrame, "ArrayList Doesn't Contain Any Credit Cards. Please Enter New Credit Cards Before Canceling."); 
                        }
                        if (creditCardCounter && cardIdMatch == false){
                            JOptionPane.showMessageDialog(myFrame, "Given CardId doesn't match. Please Enter Valid CardId.");
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(myFrame, "Enter Correct Values.");
                }
            }
        }

        //cancelCredit Card
        if(e.getSource() == cancelCreditCardBtn){
            if(cCardIdTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame, "Please Fill Out All The Necessary Fields.");
            }
            else{
                try{
                    //getting values from text fields
                    int cardId = Integer.parseInt(cCardIdTxt.getText());
                    //if arrayList is empty
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(myFrame, "ArrayList Is Empty. Please Enter New Credit Cards Before Cancelling.");
                    }
                    else{
                        boolean creditCardCounter = false;
                        boolean cardIdMatch = false;
                        //using for loop in arrayList
                        for(BankCard card : cards){
                            //checking if the card is a debitCard or not
                            if (card instanceof CreditCard){
                                creditCardCounter = true;
                                CreditCard creditCard = (CreditCard)card;
                                if(creditCard.getCardId() == cardId){
                                    cardIdMatch = true;
                                    creditCard.cancelCreditCard();
                                    JOptionPane.showMessageDialog(myFrame, "Credit Card Cancelled.");
                                }
                            }
                        }
                        if (creditCardCounter = false){
                            JOptionPane.showMessageDialog(myFrame, "ArrayList Doesn't Contain Any Credit Cards. Please Enter New Credit Cards Before Canceling."); 
                        }
                        if (creditCardCounter && cardIdMatch == false){
                            JOptionPane.showMessageDialog(myFrame, "Given CardId doesn't match. Please Enter Valid CardId.");
                        }
                    } 
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(myFrame, "Enter Correct Values.");
                }
            }
        }

        //For Clear Buttons
        if(e.getSource() == clearAllBtn){
            //setting textfields as empty string and resetting comboboxes to default values
            cardIdTxt.setText("");
            clientNameTxt.setText("");
            balanceAmountTxt.setText("");
            issuerBankTxt.setText("");
            bankAccountTxt.setText("");
            pinNumberTxt.setText("");
            cCardIdTxt.setText("");
            withdrawalAmountTxt.setText("");
            expYearComboBox.setSelectedItem(2023);
            expMonthComboBox.setSelectedItem(1);
            expDayComboBox.setSelectedItem(1);
            wPinNumberTxt.setText("");
            cvcNumberTxt.setText("");
            interestRateTxt.setText("");
            wDrawYearComboBox.setSelectedItem(1990);
            wDrawMonthComboBox.setSelectedItem(1);
            wDrawDayComboBox.setSelectedItem(1);
            dCardIdTxt.setText("");
            creditLimitTxt.setText("");
            gracePeriodTxt.setText("");
        }

    }

    public static void main(String[] args){
        //create obj of BankGUI
        BankGUI obj = new BankGUI();
    }

}