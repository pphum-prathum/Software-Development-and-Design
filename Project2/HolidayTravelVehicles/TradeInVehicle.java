class TradeInVehicle extends Vehicle {
    private double tradeInValue;

    public TradeInVehicle(String serialNo, String name, String model, int year, String manufacturer, double baseCost, double tradeInValue) {
        super(serialNo, name, model, year, manufacturer, baseCost);
        this.tradeInValue = tradeInValue;
    }

    public double getTradeInValue() { return tradeInValue; }
}
