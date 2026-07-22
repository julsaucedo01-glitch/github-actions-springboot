package api_rest_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestSpringbootApplication {

    @GetMapping("/welcome")
    public String sayHi() {
        return "Hello World!";
    }

    @GetMapping("/welcomer")
    public String sayHiNew() {
        return "Hope you are enjoying this change";
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootApplication.class, args);
	}

}
