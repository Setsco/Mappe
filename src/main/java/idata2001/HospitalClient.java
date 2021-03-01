package idata2001;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalClient {

    public HospitalClient(){
        Hospital KillThemAll = new Hospital("KillThemAll");
        HospitalTestData.fillRegisterWithTestData(KillThemAll);
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
    }

    public void removePatient(){
        String socialSecurityNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Delete patient by security number");
        System.out.println("Enter security number");
        socialSecurityNumber = sc.nextLine();
        
    }



    public static void main(String[] args) {
        removePatient();
        removeEmployee();

    }
}
