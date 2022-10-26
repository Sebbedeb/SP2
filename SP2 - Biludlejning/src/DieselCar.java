public class DieselCar extends AFuelCar{
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    private String fuel;

    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter) {
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
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee=0;


        if(kmPrLitre > 20 && kmPrLitre <= 50)
        {

            registrationFee = 330+130;
        }
        if(kmPrLitre > 15 && kmPrLitre <= 20)
        {
            registrationFee = 1050+1390;
        }
        if(kmPrLitre > 10 && kmPrLitre <= 15)
        {
            registrationFee = 2340+1850;
        }
        if(kmPrLitre > 5 && kmPrLitre <= 10)
        {
            registrationFee = 5500+2770;
        }
        if(kmPrLitre < 5)
        {
            registrationFee = 10470+15260;
        }
        if(particleFilter=false)
        {
            registrationFee+=1000;
        }

        return registrationFee;
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }
}
