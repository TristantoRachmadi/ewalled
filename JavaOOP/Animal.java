package JavaOOP;

public abstract class Animal {
    public String name;
    public String species;
    public String food;
    private int energy = 30;
    private int hungerlevel =0;

public Animal(String name,String species, String food, int energy) {
    this.name = name;
    this.species = species;
    this.food = food;
}
    // this.energy = energy;
public abstract void makeSound();

public boolean isHungry() {
    return this.hungerlevel >= 50;
}
    
// }
// public void setEnergy(int energy) 
// {
//     this.energy = energy;
// }

// public int getEnergy() 
// {
//     return energy;
// }}

public boolean isTired() {
    return this.energy < 10;
}

public void sleep() {
    this.energy ++;
    this.hungerlevel ++;
    

}
}