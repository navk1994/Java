package ArraysLists.Delegate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Delegate d1 = new Delegate("Peter");
       Delegate d2 = new Delegate("Abel");
       
       d1.changeStream();
       d1.remove();
       d2.changeStream();
       
       System.out.println(d1.name);
       
       d1.name = "John";
       
       System.out.println(d1.name);
       
       System.out.println(d1.techSkills);
       
       d1.techSkills = 9;
       System.out.println(d1.techSkills);
    }
}
