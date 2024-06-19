package dev.maria;

public class Person {

    private String name;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String originCountry;
    private char gender;


    public Person (String name, String lastName, String idNumber, int birthYear, String originCountry, char gender){
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.originCountry = originCountry;
        if (gender == 'M' || gender == 'F' || gender == 'O' ) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("The gender entered is not valid. It must be 'M', 'F' or 'O'");
        }
    };


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

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



    public void PrintAttributes(){
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("ID number: " + idNumber);
        System.out.println("Day of birth: " + birthYear);
        System.out.println("Country of origin: " + originCountry);
        System.out.println("Gender: " + gender);

    }

}
