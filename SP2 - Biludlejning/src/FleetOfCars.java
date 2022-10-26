import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<ACar> cars = new ArrayList<>();

    public void addToCars(ACar car){
        cars.add(car);
    }
    public int getTotalRegistrationFeeForFleet()
    {
        int totalRegistrationFee=0;
        for(int i=0; i<cars.size(); i++){
            totalRegistrationFee += cars.get(i).getRegistrationFee();
        }
        return totalRegistrationFee;
    }
    @Override
    public String toString(){
        return cars.toString();
    }
}
