package EcoSystem;

public class Bird extends Animal {
    public Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" (Bird) is eating");
    }
    @Override
    public void makeSound(){
        System.out.println(name+" (Bird) is chirping");
    }
    @Override
    public void displayInfo(){
        System.out.println("Bird name: "+name+", Age: "+age);
    }
}
