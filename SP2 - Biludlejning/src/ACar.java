public abstract class ACar implements Car{
    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    @Override
    public abstract String getRegistrationNumber();

    @Override
    public abstract String getMake();

    @Override
    public abstract String getModel();

    @Override
    public abstract int getNumberOfDoors();

    @Override
    public String toString(){
        return registrationNumber+", "+make+", "+model+", "+numberOfDoors+".";
    }
}
