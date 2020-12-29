package mw.cdc.producer.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicalGateController {

    @GetMapping("/logic/or")
    public ResponseEntity<String> orGate(@RequestParam(name = "operandA") int operandA,
                                         @RequestParam(name = "operandB") int operandB) {

        final int sum = operandA + operandB;
        if (sum>0) {
            return ResponseEntity.ok(String.valueOf(1));
        }
        return ResponseEntity.ok(String.valueOf(0));

    }

    @GetMapping("/logic/and")
    public ResponseEntity<String> andGate(@RequestParam(name = "operandA") int operandA,
                                         @RequestParam(name = "operandB") int operandB) {

        return ResponseEntity.ok(String.valueOf(operandA*operandB));

    }


}
