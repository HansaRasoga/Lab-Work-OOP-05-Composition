public class TestCustomer 
{
    public static void main(String [] args)
    {
        Customer customer = new Customer(1, "Punsara", 'F');
        System.out.println("ID: " + customer.getID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Gender: " + customer.getGender());
        System.out.println("Customer: " + customer.toString());
    }
}
