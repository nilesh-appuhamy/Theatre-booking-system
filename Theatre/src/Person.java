public class Person {

    //create class attributes
    public String name;
    public String surname;
    public String email;


    //create a class constructor for the main class
    public Person(String name, String surname, String email) {       //constructor will call when the object is created

        this.name = name;
        this.surname = surname;
        this.email = email;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

//private: to have more control on how to modify them
//reference:https://www.w3schools.com/java/java_constructors.asp
//[PROG]Lecture7_Objects & ClassesFinal.pdf