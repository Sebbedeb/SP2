public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();
        GasolineCar gasolineCar = new GasolineCar("1111", "Audi", "A4", 4, 50);
        DieselCar dieselCar = new DieselCar("2222", "Toyota","Yaris",4, false, 19);
        ElectricCar electricCar = new ElectricCar("3333","Tesla","Bingus", 4, 600, 300);


        fleetOfCars.addToCars(gasolineCar);
        fleetOfCars.addToCars(dieselCar);
        fleetOfCars.addToCars(electricCar);

        int index=1;
        for (ACar car : fleetOfCars.cars)
        {
            System.out.println("Car "+String.valueOf(index++)+" is "+car.toString());
        }
        System.out.println("***********");

        System.out.println("Registration fee for the "+gasolineCar.getMake()+" is: "+gasolineCar.getRegistrationFee()+".");
        System.out.println("Registration fee for the "+dieselCar.getMake()+" is: "+dieselCar.getRegistrationFee()+".");
        System.out.println("Registration fee for the "+electricCar.getMake()+" is: "+electricCar.getRegistrationFee()+".");
        System.out.println("Total registration fee for all cars: "+fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}