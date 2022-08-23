package larissagalao.com.github.financecontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinanceControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceControlApplication.class, args);

	}

}
