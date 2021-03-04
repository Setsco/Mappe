package idata2001;

/**
 * Represents a patient in the hospital facility.
 */
public class Patient extends Person implements Diagnosable{
    private String diagnosis;

    public Patient(String firstName,String lastName, String socialSecurityNumber){
        super(firstName,lastName,socialSecurityNumber);

    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
}
