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
        emergencyRoom.addEmployees(new Employee("Odd Even", "Primtallet", "312323123"));
        emergencyRoom.addEmployees(new Employee("Huppasahn", "DelFinito", "232312341"));
        emergencyRoom.addEmployees(new Nurse("Rigmor", "Mortis", "123241231"));
        emergencyRoom.addEmployees(new GeneralPractitioner("Inco", "Gnito", "12323123"));
        emergencyRoom.addEmployees(new Surgeon("Inco", "Gnito", "12324123"));
        emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "1234123"));
        emergencyRoom.addPatient(new Patient("Ove", "Ralt", "123324123"));
        hospital.addDepartment(emergencyRoom);
        Department childrensPolyclinic = new Department("Barne poliklinikk");
        childrensPolyclinic.addEmployees(new Employee("Salti", "Kaffen", "123423123"));
        childrensPolyclinic.addEmployees(new Employee("Nidel V.", "Elvefølger", "1234123125"));
        childrensPolyclinic.addEmployees(new Nurse("Anton", "Nym", "123553423654414"));
        childrensPolyclinic.addEmployees(new GeneralPractitioner("Gene", "Sis", "123551232"));
        childrensPolyclinic.addPatient(new Patient("Nanna", "Na", "255525122"));
        childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", "2343453233"));
        hospital.addDepartment(childrensPolyclinic);
    }
}

