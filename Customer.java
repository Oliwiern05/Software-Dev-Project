public class Customer 
{
    private int customerID;
    private String name;
    private String secondName;
    private String email;

    // Constructor for the customer field
    public Customer(int customerID, String name, String secondName, String email) 
    {
        this.customerID = customerID;
        this.name = name;
        this.secondName = secondName;
        this.email = email;
    }

    // Getters
    public int getCustomerID() 
    {
         return customerID;
    }
    public String getName() 
    {
        return name;
    }
    public String getSecondName() 
    {
        return secondName;
    }
    public String getEmail()
    {
        return email;
    }
}
