package dev.maria;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        //Createed two objects from Person's class
        
        //Person it's our variable's type
        //person it's our variable's name, and it makes reference to a objet which is Person's type
        //new creates a new object instance
        //Person (the last one) it's creating a new objet that calls the constructor in Person's class

        Person person = new Person("Paquita", "Salas", "12345678Q", 1981);
        person.PrintAttributes();

        Person otherPerson = new Person("Magüi", "Santa", "98765432A", 1990);
        otherPerson.PrintAttributes();
    }
}
