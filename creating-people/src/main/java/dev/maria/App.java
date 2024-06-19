package dev.maria;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        Person person = new Person("Paquita", "Salas", "12345678Q", 1981);
        person.PrintAttributes();

        Person otherPerson = new Person("Magüi", "Santa", "98765432A", 1990);
        otherPerson.PrintAttributes();
        
    }
}
