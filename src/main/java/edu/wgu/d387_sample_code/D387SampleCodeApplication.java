package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translation.welcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


		welcomeMessage welcomeMessageEnglish = new welcomeMessage(Locale.US);
		Thread englishWelcomeMessage = new Thread(welcomeMessageEnglish);

		englishWelcomeMessage.start();

		welcomeMessage welcomeMessageFrench = new welcomeMessage((Locale.CANADA_FRENCH));
		Thread frenchWelcomeMessage = new Thread(welcomeMessageFrench);
		frenchWelcomeMessage.start();
	}
}
