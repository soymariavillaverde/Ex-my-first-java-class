package dev.maria;

public class Person {
    //Atributes
    private String name;
    private String lastName;
    private String idNumber;
    private int birthYear;

    //Constructors
    public Person (String name, String lastName, String idNumber, int birthYear ){
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    };

    //Methods

        //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

        //other methods
    public void PrintAttributes(){
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("ID number: " + idNumber);
        System.out.println("Day of birth: " + birthYear);
    }

}
