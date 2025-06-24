public class TestAcoount 
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer(1, "Punsara", 'F');
        Account account = new Account(1001, customer, 5000.0);
        
        System.out.println("Account No: " + account.getAccNo());
        System.out.println("Customer: " + account.getCustomer().toString());
        System.out.println("Balance: " + account.getBalance());
        
        account.deposit(1500.0);
        System.out.println("After deposit, Balance: " + account.getBalance());
        
        account.withdraw(2000.0);
        System.out.println("After withdrawal, Balance: " + account.getBalance());
        
        System.out.println("Account Details: " + account.toString());
    }
}
