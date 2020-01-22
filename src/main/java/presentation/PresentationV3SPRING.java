package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationV3SPRING {
public static void main(String[] args) {
	ApplicationContext context=new
			ClassPathXmlApplicationContext("config.xml");
			IMetier metier=(IMetier) context.getBean("metier");
			System.out.println(metier.calcul());

}
}
