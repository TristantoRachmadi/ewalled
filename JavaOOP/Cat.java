package JavaOOP;

public class Cat extends Animal {

    public boolean hasFur;
    public int numberofWhiskers;
    private int lives = 9;
   //Contructor paramater
    public Cat(String name, String species, String food, int energy, boolean hasFur, int Whiskers) {
        super(name, species, food, energy);
        this.hasFur = hasFur;
        this.numberofWhiskers = Whiskers;}
    public void makeSound() {
        System.out.println("Meow");

      
    }
    
}

