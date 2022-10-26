public abstract class AFuelCar extends ACar{
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }

    @Override
    public abstract String getRegistrationNumber();

    @Override
    public abstract String getMake();

    @Override
    public abstract String getModel();

    @Override
    public abstract int getNumberOfDoors();

    public abstract String getFuel(); //Returns Gasoline or Diesel

    public int getkmPrLitre(){
        return getkmPrLitre();
    } //returns km/l

    @Override
    public String toString(){
        return ("reg. nr: "+registrationNumber+", make: "+make+", model: "+model+", # of doors: "+numberOfDoors+", km pr. litre: "+kmPrLitre+".");
    }
}
