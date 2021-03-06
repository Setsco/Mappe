package idata2001;

/**
 * Represents a doctor in a hospital.
 */
abstract public class Doctor extends Employee {

    public Doctor(String firstName, String lastName, String socialSecurityNumber){
      super(firstName,lastName,socialSecurityNumber);
   }

   public abstract void setDiagnosis(Patient patient , String diagnosis);
}
