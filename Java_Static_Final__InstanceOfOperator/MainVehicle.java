public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("DL10AB1234", "Vikram", "Car");
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
    }
}
