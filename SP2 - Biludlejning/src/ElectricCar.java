public class ElectricCar extends ACar{
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;
    private int batteryCapacity;
    private int maxRangeKm;
    private int whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee=0;
        double kmL = 100/this.getwhPrKm();
        kmL = kmL/91.25;

        if(kmL > 20 && kmL <= 50)
        {
            registrationFee = 330;
        }
        if(kmL > 15 && kmL <= 20)
        {
            registrationFee = 1050;
        }
        if(kmL > 10 && kmL <= 15)
        {
            registrationFee = 2340;
        }
        if(kmL > 5 && kmL <= 10)
        {
            registrationFee = 5500;
        }
        if(kmL < 5)
        {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRangeKm;
    }

    public int getwhPrKm(){
        return maxRangeKm/batteryCapacity;
    }

    @Override
    public String toString(){
        return registrationNumber+", "+make+", "+model+", "+numberOfDoors+", "+batteryCapacity+", "+maxRangeKm;
    }
}
