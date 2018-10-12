package com.Animals.Animal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal dog = new Animal("Dog", "Brown", 10);
        Animal cat = new Animal("Cat", "White", 8);
        Animal parrot = new Animal("Parrot", "Green", 2);
        
        
        dog.run();
        cat.shout();
        parrot.shout();
        
    }
}
