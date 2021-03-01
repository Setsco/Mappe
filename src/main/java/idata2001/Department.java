package idata2001;
import java.util.ArrayList;
import java.util.Iterator;

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

        public void removePerson(Person person){
            boolean removed = false;
            Iterator<Employee> employeeIterator = employees.iterator();
            Iterator<Patient> patientIterator = patients.iterator();

            if(employees.isEmpty() && patients.isEmpty()){
                System.out.println("No persons registered in this department");
            }
            else {
                try {
                    while(!removed && (employeeIterator.hasNext() || patientIterator.hasNext())){
                        if (employeeIterator.hasNext()){
                            Person employee = employeeIterator.next();
                            if(employee.getPersonNumber().equals(person.getPersonNumber())){
                                patients.remove(person);
                                removed = true;
                            }
                        }
                        else{
                            throw new RemoveException("Person does not exist");
                        }
                    }
                }catch (RemoveException re){
                    System.out.println("Person does not exist in any list");
                }catch (Exception e){
                    System.out.println("Something's fucked my dood");
                }
            }

            }
        }


