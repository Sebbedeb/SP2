public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRangeKm;
    private int whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber,make,model,numberOfDoors);
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
        double kmL = this.getwhPrKm()/91.25;
        kmL = 100/kmL/100;

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
        return batteryCapacity/maxRangeKm;
    }

    @Override
    public String toString(){
        return ("reg. nr.: "+registrationNumber+", make: "+make+", model: "+model+", # of doors: "+numberOfDoors+", battery capacity: "+batteryCapacity+", max range in km: "+maxRangeKm+".");
    }
}
