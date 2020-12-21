package mw.cdc.producer.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskAboutAgeController {

    @GetMapping("/askmeaboutage")
    public ResponseEntity<String> askaboutage(@RequestParam(name = "age") int age) {

        if (age <= 18) {
            return ResponseEntity.ok("Child");
        }
        return ResponseEntity.ok("Unknown");
    }

}
