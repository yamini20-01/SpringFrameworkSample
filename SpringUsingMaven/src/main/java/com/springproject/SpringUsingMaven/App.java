package com.springproject.SpringUsingMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
   /*     Car c=new Car();
        c.drive();
        Bike b=new Bike();  
        b.drive();
   */
    /*	
     * Vehicle v=(Vehicle)context.getBean("vehicle");
     * Vehicle v=new Car();
    	v.drive();
    */
    	
 //   	Vehicle v=(Vehicle)context.getBean("bike");
 //   	v.drive();
    	
 //   	Tyre t=(Tyre)context.getBean("tyre");
 //   	System.out.println(t);
    	Car obj=(Car)context.getBean("car");
    	obj.drive();
    	
    }
}
