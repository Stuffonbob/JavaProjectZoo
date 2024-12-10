package EcoSystem;

public class Main{
    public static void main(String[]args){
        Animal lion= new Lion("Jack", 7);
        Animal eagle=new Eagle("AmericanEagle", 56);
        lion.eat();
        lion.makeSound();
        lion.displayInfo();
        
        eagle.eat();
        eagle.makeSound();
        eagle.displayInfo();
    }
}
