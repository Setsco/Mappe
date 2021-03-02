package idata2001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class HospitalClient {
    private final Hospital hospital;

    public HospitalClient(){
        this.hospital = new Hospital("killThemAll");
        HospitalTestData.fillRegisterWithTestData(hospital);
    }

    public void removePatient(){
        Scanner sc = new Scanner(System.in);
        String removedPatient;
        List<Department> departments = hospital.getDepartments();

        System.out.println("Delete a person by security number");
        System.out.println("Enter security number");
        removedPatient = sc.nextLine();

            departments.forEach(department ->
            {
                try {
                    department.removePerson(removedPatient);
                } catch (RemoveException e) {
                    System.out.println("this person does not exist in the register...");
                }
            });


        }

    public void removeEmployee(){

        Scanner sc = new Scanner(System.in);
        String removedEmployee;
        List<Department> departments = hospital.getDepartments();

        System.out.println("Delete a person by security number");
        System.out.println("Enter security number");
        removedEmployee = sc.nextLine();

        departments.forEach(department ->
        {
            try {
                department.removePerson(removedEmployee);
            } catch (RemoveException e) {
                System.out.println("This person does not exist in the register...");
            }
        });


    }






    public static void main(String[] args) {
        HospitalClient hC = new HospitalClient();
        try{
            hC.removeEmployee();
            hC.removePatient();
        }catch (IllegalArgumentException e){
            System.out.println("Social security number cannot be blank or null. Please try entering a valid number.");

        }



    }
}
