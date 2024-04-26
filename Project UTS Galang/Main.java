// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek dokter
        Doctor dokter1 = new Doctor("Dr. Budi", 40, "Bedah Umum");
        Doctor dokter2 = new Doctor("Dr. Ani", 35, "Dokter Gigi");
        
        // Membuat objek perawat
        Nurse perawat1 = new Nurse("Siti", 30, 5);
        Nurse perawat2 = new Nurse("Rudi", 25, 3);
        
        // Membuat objek pasien
        Patient pasien1 = new Patient("Agus", 50, "Patah tulang");
        Patient pasien2 = new Patient("Dewi", 28, "Demam");
        
        // Membuat objek rumah sakit
        Hospital rumahSakit = new Hospital();
        
        // Menambahkan staf ke rumah sakit
        rumahSakit.tambahStaff(dokter1);
        rumahSakit.tambahStaff(dokter2);
        rumahSakit.tambahStaff(perawat1);
        rumahSakit.tambahStaff(perawat2);
        
        // Menambahkan pasien ke rumah sakit
        rumahSakit.tambahPatient(pasien1);
        rumahSakit.tambahPatient(pasien2);
        
        // Menampilkan semua staf di rumah sakit
        rumahSakit.tampilkanStaff();
        
        // Menampilkan semua pasien di rumah sakit
        rumahSakit.tampilkanPatients();
    }
}
