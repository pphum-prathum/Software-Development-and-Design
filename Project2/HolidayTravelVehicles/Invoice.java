class Invoice {
    private Customer customerInfo;
    private TradeInVehicle tradeInVehicle;
    private double tradeInAllowance;
    private Vehicle purchasedVehicleInfo;
    private double finalPrice;
    private double taxes;
    private double licenseFee;
    private String customerSignature;

    public Invoice(Customer customerInfo, TradeInVehicle tradeInVehicle, double tradeInAllowance, Vehicle purchasedVehicleInfo, 
                   double finalPrice, double taxes, double licenseFee, String customerSignature) {
        this.customerInfo = customerInfo;
        this.tradeInVehicle = tradeInVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.purchasedVehicleInfo = purchasedVehicleInfo;
        this.finalPrice = finalPrice;
        this.taxes = taxes;
        this.licenseFee = licenseFee;
        this.customerSignature = customerSignature;
    }

    public Customer getCustomerInfo() { return customerInfo; }
    public TradeInVehicle getTradeInVehicle() { return tradeInVehicle; }
    public double getTradeInAllowance() { return tradeInAllowance; }
    public Vehicle getPurchasedVehicleInfo() { return purchasedVehicleInfo; }
    public double getFinalPrice() { return finalPrice; }
    public double getTaxes() { return taxes; }
    public double getLicenseFee() { return licenseFee; }
    public String getCustomerSignature() { return customerSignature; }
}
