package idata2001;

/**
 * Represents a surgeon in a hosptial.
 */
public class Surgeon extends Doctor {

    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }


    public void setDiagnosis(Patient patient,String diagnosis){
        patient.setDiagnosis(diagnosis);
    }
}
