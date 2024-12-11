package EcoSystem;

public class Mammal extends Animal {
    public Mammal(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+"(Mammal) is eating");
    }
    @Override
    public void makeSound(){
        System.out.println(name+"(Mammal) is making sound ");
    }
    @Override
    public void displayInfo(){
        System.out.println("Mammal name: "+name+", Age: "+age);
    }
}
