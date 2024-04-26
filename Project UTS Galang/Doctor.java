// File: Doctor.java
public class Doctor extends Person {
    private String spesialisasi;
    
    public Doctor(String nama, int usia, String spesialisasi) {
        super(nama, usia);
        this.spesialisasi = spesialisasi;
    }
    
    // Getter dan setter untuk spesialisasi
    public String getSpesialisasi() {
        return spesialisasi;
    }
    
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    
    // Override metode tampilkanInfo untuk menampilkan informasi khusus dokter
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}
