public class DieselCar extends AFuelCar{

    private String fuel ="diesel";

    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors, kmPrLitre);

        this.particleFilter=particleFilter;
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
