package mw.cdc.producer.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity find(@RequestParam(name = "type") String type) {
        return ResponseEntity.ok().build();
    }

}
