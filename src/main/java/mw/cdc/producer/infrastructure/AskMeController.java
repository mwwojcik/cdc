package mw.cdc.producer.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskMeController {

    @GetMapping("/askme")
    public ResponseEntity<String> askMe(@RequestParam(name="question") String question) {
        if (question.equals("Are you alive?")) {
            return ResponseEntity.ok().body("Yes");
        }
     return ResponseEntity.ok("Clarify the question!") ;
     }

}
