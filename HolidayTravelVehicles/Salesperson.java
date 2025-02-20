class Salesperson extends Person {
    int customerID;

    public Salesperson(String name, String address, String phoneNo, int customerID) {
        super(name, address, phoneNo);
        this.customerID = customerID;
    }

    public int getCustomerID() { return customerID; }

    public void fillInvoice(Invoice invoice) {
        System.out.println("Filling invoice for customer: " + invoice.getCustomerInfo().getName());
        System.out.println("Final Price: $" + invoice.getFinalPrice());
    }

    public void negotiatePurchase(double counterOffer) {
        System.out.println("Salesperson counters with: $" + counterOffer);
    }
}
