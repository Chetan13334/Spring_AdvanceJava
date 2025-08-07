package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainM {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		//Costomer c = context.getBean(Costomer.class);
		Costomer c = context.getBean("costomer", Costomer.class);
		
		System.out.println(c.getS().show());
		System.out.println(c.getS2().show());

		
		
		System.out.println("Done");
	}

}
