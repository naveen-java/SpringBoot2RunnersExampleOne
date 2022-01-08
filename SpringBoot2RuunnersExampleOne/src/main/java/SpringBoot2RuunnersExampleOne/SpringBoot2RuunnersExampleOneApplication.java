package SpringBoot2RuunnersExampleOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2RuunnersExampleOneApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBoot2RuunnersExampleOneApplication.class, args);
		Object ob = ac.getBean("messageRunner");
				System.out.println(ob);
		
	}

}
