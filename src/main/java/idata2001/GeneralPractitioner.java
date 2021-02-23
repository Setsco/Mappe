package idata2001;

public class GeneralPractitioner extends Doctor {

    public GeneralPractitioner(String firstName,String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    public void setDiagnosis(Patient patient, String diagnosis){
        patient.setDiagnosis(diagnosis);
    }
}
