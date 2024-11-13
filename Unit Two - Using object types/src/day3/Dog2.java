package day3;

public class Dog2 {
    public static void main(String[] args) {
        Dog mydog = new Dog("Rocky", "Labador", 5);
        mydog.bark(3); 

        Owner owner1 = new Owner("Emily", mydog);
        owner1.walkDog(20);
        owner1.feedDog("Chicken");

        mydog.sleep(8);
        owner1.printDogAge();

        Dog seconddog = new Dog("Luna", "Poodle", 7);
        seconddog.bark(2);
        Owner owner2 = new Owner("David", seconddog);
        owner2.walkDog(15);
        owner2.feedDog("Beef");
        owner2.printDogAge();
        mydog.sleep(6);
        seconddog.sleep(7);

    }
    
}
