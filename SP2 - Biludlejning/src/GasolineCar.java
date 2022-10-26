public class GasolineCar extends AFuelCar{
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;
    private String fuel;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    @Override
    public String getFuel() {
        return "Gasoline";
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
            registrationFee = 1040;
        }

        return registrationFee;
    }
}
