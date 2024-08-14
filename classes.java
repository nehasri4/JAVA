// Define the Person class
class Person {
    // Attributes of the class
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classes {
    public static void main(String[] args) {
      
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

    
        System.out.println("Person 1 Information:");
        person1.displayInfo();

    
        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();

      
        person1.setName("Alicia");
        person1.setAge(31);

        
        System.out.println("\nUpdated Person 1 Information:");
        person1.displayInfo();
    }
}
