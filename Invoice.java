public class Invoice 
{
    private int invoiceID;
    private int customerID;
    private int productID;
    private int quantity;

    // Constructor
    public Invoice(int invoiceID, int customerID, int productID, int quantity) 
    {
        this.invoiceID = invoiceID;
        this.customerID = customerID;
        this.productID = productID;
        this.quantity = quantity;
    }

    // Getters
    public int getInvoiceID()
    {
        return invoiceID;
    }
    public int getCustomerID()
    {
        return customerID;
    }
    public int getProductID()
    {
        return productID;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
