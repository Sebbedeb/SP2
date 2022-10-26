public abstract class AFuelCar extends ACar{
    int kmPrLitre;

    @Override
    public abstract String getRegistrationNumber();

    @Override
    public abstract String getMake();

    @Override
    public abstract String getModel();

    @Override
    public abstract int getNumberOfDoors();

    public abstract String getFuel(); //Returns Gasoline or Diesel

    public int kmPrLitre(){
        return kmPrLitre();
    } //returns km/l

    @Override
    public String toString(){
        return (registrationNumber+", "+make+", "+model+", "+numberOfDoors+", "+kmPrLitre+".").toString();
    }
}
