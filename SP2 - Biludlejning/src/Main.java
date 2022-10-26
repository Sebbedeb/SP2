public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();
        GasolineCar gasolineCar = new GasolineCar("1111", " Audi", "A4", 4);
        DieselCar dieselCar = new DieselCar("2222", "Toyota","Yaris",4, true);
        ElectricCar electricCar = new ElectricCar("","","", 4, 60, 370);


        fleetOfCars.addToCars(gasolineCar);
        fleetOfCars.addToCars(dieselCar);
        fleetOfCars.addToCars(electricCar);

        System.out.println(fleetOfCars.toString());
        System.out.println("Registration fee for gasoline car: "+gasolineCar.getRegistrationFee());
        System.out.println("Registration fee for diesel car: "+dieselCar.getRegistrationFee());
        System.out.println("Registration fee for electric car: "+electricCar.getRegistrationFee());
        System.out.println("Total registration fee for all cars: "+fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}