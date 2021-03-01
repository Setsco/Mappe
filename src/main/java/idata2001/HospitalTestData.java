package idata2001;

import idata2001.Nurse;
import idata2001.GeneralPractitioner;
import idata2001.Surgeon;

public class HospitalTestData {
    /**
     * Fills the hospital provided as a parameter with
     * departments and some employees and patients.
     *
     * @param hospital the hospital to be populated with testdata
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {
        // Add some departments
        Department emergencyRoom = new Department("Akutten");
        emergencyRoom.addEmployees(new Employee("Odd Even", "Primtallet", null));
        emergencyRoom.addEmployees(new Employee("Huppasahn", "DelFinito", null));
        emergencyRoom.addEmployees(new Nurse("Rigmor", "Mortis", null));
        emergencyRoom.addEmployees(new GeneralPractitioner("Inco", "Gnito", null));
        emergencyRoom.addEmployees(new Surgeon("Inco", "Gnito", null));
        emergencyRoom.addPatient(new Patient("Nina", "Teknologi", null));
        emergencyRoom.addPatient(new Patient("Ove", "Ralt", null));
        hospital.addDepartment(emergencyRoom);
        Department childrensPolyclinic = new Department("Barne poliklinikk");
        childrensPolyclinic.addEmployees(new Employee("Salti", "Kaffen", null));
        childrensPolyclinic.addEmployees(new Employee("Nidel V.", "Elvefølger", null));
        childrensPolyclinic.addEmployees(new Nurse("Anton", "Nym", null));
        childrensPolyclinic.addEmployees(new GeneralPractitioner("Gene", "Sis", null));
        childrensPolyclinic.addPatient(new Patient("Nanna", "Na", null));
        childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", null));
        hospital.addDepartment(childrensPolyclinic);
    }
}

