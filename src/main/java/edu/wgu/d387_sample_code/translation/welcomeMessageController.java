package edu.wgu.d387_sample_code.translation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class welcomeMessageController {
    @GetMapping("/welcome")
    public ResponseEntity<String> showWelcome (@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        welcomeMessage message = new welcomeMessage(locale);

        return new ResponseEntity<String> (message.getWelcomeMessage(), HttpStatus.OK);
    }
}
