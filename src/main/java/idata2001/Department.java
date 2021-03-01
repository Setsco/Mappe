package idata2001;
import java.util.ArrayList;

public class Department {

    private String departmentName;
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

    public String getDepartmentName(){
        return departmentName;
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public void addEmployees(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Patient> getPatients(){
        return patients;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    //public int hashCode()

    public boolean equals(Object object){
        boolean equal;
        if(object.hashCode() == hashCode()){
            equal = true;}
        else{
            equal = false;
        }
        return equal;
        }
    }
}
