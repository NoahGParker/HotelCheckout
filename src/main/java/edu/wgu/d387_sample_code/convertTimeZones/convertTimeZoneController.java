package edu.wgu.d387_sample_code.convertTimeZones;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class convertTimeZoneController {
    @GetMapping("/presentation")
    public ResponseEntity<String> timePresentation() {
        String times = "The Presentations start at: " + convertTimeZone.getTime();
        return new ResponseEntity<String> (times, HttpStatus.OK);
    }


}
