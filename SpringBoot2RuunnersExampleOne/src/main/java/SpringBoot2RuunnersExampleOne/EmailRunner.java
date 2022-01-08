package SpringBoot2RuunnersExampleOne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Im from Email Runner!");

	}

}
