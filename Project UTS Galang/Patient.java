// File: Patient.java
public class Patient extends Person {
    private String diagnosis;
    
    public Patient(String nama, int usia, String diagnosis) {
        super(nama, usia);
        this.diagnosis = diagnosis;
    }
    
    // Getter dan setter untuk diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    // Override metode tampilkanInfo untuk menampilkan informasi khusus pasien
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Diagnosis: " + diagnosis);
    }
}
