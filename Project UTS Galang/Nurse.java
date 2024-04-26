// File: Nurse.java
public class Nurse extends Person {
    private int pengalamanTahun;
    
    public Nurse(String nama, int usia, int pengalamanTahun) {
        super(nama, usia);
        this.pengalamanTahun = pengalamanTahun;
    }
    
    // Getter dan setter untuk pengalamanTahun
    public int getPengalamanTahun() {
        return pengalamanTahun;
    }
    
    public void setPengalamanTahun(int pengalamanTahun) {
        this.pengalamanTahun = pengalamanTahun;
    }
    
    // Override metode tampilkanInfo untuk menampilkan informasi khusus perawat
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pengalaman Tahun: " + pengalamanTahun);
    }
}
