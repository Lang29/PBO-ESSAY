// File: Hospital.java
import java.util.ArrayList;

public class Hospital {
    private ArrayList<Person> staff;
    private ArrayList<Patient> patients;
    
    public Hospital() {
        staff = new ArrayList<>();
        patients = new ArrayList<>();
    }
    
    // Metode untuk menambahkan dokter atau perawat ke rumah sakit
    public void tambahStaff(Person person) {
        staff.add(person);
    }
    
    // Metode untuk menambahkan pasien ke rumah sakit
    public void tambahPatient(Patient patient) {
        patients.add(patient);
    }
    
    // Metode untuk menampilkan semua staf di rumah sakit
    public void tampilkanStaff() {
        System.out.println("Staff Rumah Sakit:");
        for (Person person : staff) {
            person.tampilkanInfo();
            System.out.println();
        }
    }
    
    // Metode untuk menampilkan semua pasien di rumah sakit
    public void tampilkanPatients() {
        System.out.println("Pasien Rumah Sakit:");
        for (Patient patient : patients) {
            patient.tampilkanInfo();
            System.out.println();
        }
    }
}
