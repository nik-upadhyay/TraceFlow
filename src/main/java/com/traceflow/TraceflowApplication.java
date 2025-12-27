package com.traceflow;

import com.traceflow.model.Story;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TraceflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraceflowApplication.class, args);

		Story story1 = new Story(1L, "Login Feature", "Implement login", "Auth Module");
        System.out.println("Story created: " + story1.getTitle() + " in module " + story1.getModule());
	}

}
