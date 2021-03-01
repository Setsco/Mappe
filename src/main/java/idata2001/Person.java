package idata2001;

abstract public class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        if(socialSecurityNumber.isBlank()){
           throw new IllegalArgumentException("Social security number cannot be empty");
        }
        else{
            this.socialSecurityNumber = socialSecurityNumber;
           }

    }

    public String getPersonNumber(){
        return socialSecurityNumber;
    }

    public void setPersonNumber(String personNumber){
        socialSecurityNumber = personNumber;
    }

    public void setFirstName(String firstName){
     this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        String fullName = this.firstName + this.lastName;
        return fullName;
    }
}
