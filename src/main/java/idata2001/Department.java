package idata2001;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a specific department in a hospital.
 */
public class Department {

    private final String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;

    public Department(String departmentName){
        if(departmentName.isBlank()){
            throw new IllegalArgumentException("Department name cannot be blank.");
        }
        else{
            this.departmentName = departmentName;
        }
    }

    /**
     * Gets department name
     * @return department name
     */
    public String getDepartmentName(){
        return departmentName;
    }

    /**
     * Gets list of employees.
     * @return List of employees
     */
    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    /**
     * Adds employee to list.
     * @param employee
     */
    public void addEmployees(Employee employee){
        employees.add(employee);
    }

    /**
     * Gets patients list.
     * @return patient list.
     */
    public ArrayList<Patient> getPatients(){
        return patients;
    }

    /**
     * Adds patient to list.
     * @param patient
     */
    public void addPatient(Patient patient){
        patients.add(patient);
    }


    /**
     * Compares two objects with a unique integer. If unique number matches then objects are equal.
     * @param object
     * @return whether the objects are equal or not.
     */
    public boolean equals(Object object){
        boolean equal;
        if(object.hashCode() == hashCode()){
            equal = true;}
        else{
            equal = false;
        }
        return equal;
        }

    /**
     * Removes person from one of the lists available.
     * @param securityNumber
     * @throws RemoveException
     */
    public void removePerson(String securityNumber) throws RemoveException {
            boolean removed = false;
            Iterator<Employee> employeeIterator = employees.iterator();
            Iterator<Patient> patientIterator = patients.iterator();

            if(employees.isEmpty() && patients.isEmpty()){
                System.err.println("No persons registered in this department");
            }
            else {
                    while(!removed && (employeeIterator.hasNext() || patientIterator.hasNext())) {
                        if (employeeIterator.hasNext()) {
                            Person employee = employeeIterator.next();
                            if (employee.getPersonNumber().equals(employee.getPersonNumber())) {
                                patients.remove(securityNumber);
                                removed = true;
                            }
                            if(patientIterator.hasNext()){
                                Person patient = patientIterator.next();
                                if(patient.getPersonNumber().equals(patient.getPersonNumber())){
                                    patients.remove(securityNumber);
                                    removed = true;
                                }
                            }
                        }
                        if(!removed){
                            throw new RemoveException("Person does not exist");
                        }

                        }
                    }
                    }
}







