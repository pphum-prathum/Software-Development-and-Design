public class Main {
    public static void main(String[] args) {
        // Creating a new Vehicle object
        Vehicle myCar = new Vehicle("5EB9DA52-426C-49BF-902B-21BAB02B2DD6", "PEUGEOT 2008 De Nouveau", "SUV", 2023, "Peugeot", 1089000);

        // Printing vehicle details using getters
        System.out.println("Vehicle Details:");
        System.out.println("Serial No: " + myCar.getSerialNo());
        System.out.println("Name: " + myCar.getName());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Manufacturer: " + myCar.getManufacturer());
        System.out.println("Base Cost: ฿" + myCar.getBaseCost());
    }
}
