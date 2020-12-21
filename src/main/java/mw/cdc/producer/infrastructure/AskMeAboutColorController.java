package mw.cdc.producer.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskMeAboutColorController {

    @GetMapping("/askmeaboutcolour")
    public ResponseEntity<String> colour(@RequestParam String colour) {
        if (colour.equals("RED")) {
            return ResponseEntity.ok("Warm");
        }
     return ResponseEntity.ok("Not recognized!") ;
     }

}
