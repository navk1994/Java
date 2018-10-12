package com.Persons.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Person p1 = new Person("Gerald", 35, "Wire Cutter");
        Person p2 = new Person("Tony", 51, "Owl Farmer");
        Person p3 = new Person("Lilly", 21, "Tomato Nutritionist");
        
        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        
        Person.searchPerson(people, "Tony");
        

       
       
       
   //    people.forEach(System.out::println);
    	   
    
       
    }
}
