package idata2001;

import java.util.ArrayList;

/**
 * Represents a hospital.
 */
public class Hospital {

    private final String hospitalName;
    private ArrayList<Department> departments;

    public Hospital(String hospitalName){
        if(hospitalName.isBlank()){
            throw new IllegalArgumentException("You must give a name to the Hospital");
        }
        else{
            this.hospitalName = hospitalName;
        }
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public ArrayList<Department> getDepartments(){
        return departments;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }



}
