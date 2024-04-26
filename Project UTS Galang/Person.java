// File: Person.java
public class Person {
    private String nama;
    private int usia;
    
    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    
    // Getter dan setter untuk nama dan usia
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUsia() {
        return usia;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    // Metode untuk menampilkan informasi umum tentang seseorang
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
