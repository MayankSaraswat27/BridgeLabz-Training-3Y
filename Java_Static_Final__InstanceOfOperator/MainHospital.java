public class MainHospital {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Karan", 35, "Fever");
        Patient p2 = new Patient(102, "Anita", 40, "Cough");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
