package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresentationV4SPRINGANNOTATION {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new AnnotationConfigApplicationContext("dao","metier");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		IMetier metier=ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
		}


}
