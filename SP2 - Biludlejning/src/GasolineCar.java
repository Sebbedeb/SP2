public class GasolineCar extends AFuelCar{

    private String fuel = "gasoline";

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors, kmPrLitre);
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
    public String getFuel() {
        return fuel;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee=0;


        if(kmPrLitre > 20 && kmPrLitre <= 50)
        {
            registrationFee = 330;
        }
        if(kmPrLitre > 15 && kmPrLitre <= 20)
        {
            registrationFee = 1050;
        }
        if(kmPrLitre > 10 && kmPrLitre <= 15)
        {
            registrationFee = 2340;
        }
        if(kmPrLitre > 5 && kmPrLitre <= 10)
        {
            registrationFee = 5500;
        }
        if(kmPrLitre < 5)
        {
            registrationFee = 10040;
        }

        return registrationFee;
    }
}
