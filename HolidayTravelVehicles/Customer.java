class Customer extends Person {
    int customerID;
    int purchasedVehicleAmount;

    public Customer(String name, String address, String phoneNo, int customerID, int purchasedVehicleAmount) {
        super(name, address, phoneNo);
        this.customerID = customerID;
        this.purchasedVehicleAmount = purchasedVehicleAmount;
    }

    public int getCustomerID() { return customerID; }
    public int getPurchasedVehicleAmount() { return purchasedVehicleAmount; }

    public void addOption(DealerInstalledOption option) {
        System.out.println("Added option: " + option.getDescription() + " for $" + option.getPrice());
    }

    public void tradeVehicle(TradeInVehicle tradeInVehicle) {
        System.out.println("Trading in vehicle: " + tradeInVehicle.getName() + " valued at $" + tradeInVehicle.getTradeInValue());
    }

    public void negotiatePurchase(double offerPrice) {
        System.out.println("Customer negotiates price: Offering $" + offerPrice);
    }
}
