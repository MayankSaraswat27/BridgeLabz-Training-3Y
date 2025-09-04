public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mayank", "Car");
        Vehicle v2 = new Vehicle("Manish", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
