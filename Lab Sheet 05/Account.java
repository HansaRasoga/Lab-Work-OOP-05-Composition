public class Account 
{
    private int accNo;
    private Customer customer;
    private double balance=0.0;

    public Account(int accNo, Customer customer) 
    {
        this.accNo = accNo;
        this.customer = customer;
    }

    public Account(int accNo, Customer customer, double balance) 
    {
        this.accNo = accNo;
        this.customer = customer;
        this.balance = balance;
    }

    public int getAccNo() 
    {
        return accNo;
    }

    public Customer getCustomer() 
    {
        return customer;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return "Account No: " + accNo + ", Customer: " + customer.toString() + ", Balance: " + balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            this.balance += amount;
        } 
    }

    public void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
        }

        else
        {
            System.out.println("Withdrawal amount exceeds balance.");
        }
    }
}
