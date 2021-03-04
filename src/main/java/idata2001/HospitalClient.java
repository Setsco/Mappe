package idata2001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Represents the main hospital client.
 */
public class HospitalClient {
    private final Hospital hospital;

    public HospitalClient(){
        this.hospital = new Hospital("killThemAll");
        HospitalTestData.fillRegisterWithTestData(hospital);
    }

    /**
     * Removes patient from list.
     */
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

    /**
     * Removes employee from list.
     */
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

    /**
     * Shows main menu for appplication
     * @return User many choice
     */
    private int showMenu()
    {
        int userChoice = 0;

        System.out.println("\n*** Hospital client version 0.1 ***\n");
        System.out.println("1. Delete employee");
        System.out.println("2. Delete patient");
        System.out.println("9. Quit");

        Scanner input = new Scanner(System.in);

        // Make sure that the user did input an int
        if (input.hasNextInt())
        {
            userChoice = input.nextInt();
        }
        return userChoice;
    }

    /**
     * Main application where user deletes employees or patients from current lists.
     */
    private void startApplication(){
        boolean finished = false;

        while(!finished){
            int userChoice = this.showMenu();
                    switch (userChoice){
                        case 1:
                            try {
                                removeEmployee();
                            } catch (RemoveException e){
                                System.out.println("Employee does not exist in list.");
                            }
                            break;

                        case 2:
                            try {
                                removePatient();
                            }catch (RemoveException e){
                                System.out.println("Patient does not exist in list.");
                            }
                            break;

                        case 9:
                            System.out.println("Thanks for using this program.");
                            finished = true;
                            break;

                        default:
                            System.out.println("You must choose between 1,2 or 9.");
                            break;
                    }
        }
    }






    public static void main(String[] args) {
        HospitalClient hC = new HospitalClient();
        hC.startApplication();

    }
}
