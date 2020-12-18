package mw.cdc.producer.infrastructure;

import mw.cdc.producer.model.BonusPoints;
import mw.cdc.producer.service.BonusPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/points")
public class BonusPointsController {

    BonusPointsService bonusPointsService;

    @Autowired
    public BonusPointsController(BonusPointsService bonusPointsService) {
        this.bonusPointsService = bonusPointsService;
    }

    @GetMapping
    public ResponseEntity<BonusPoints> check(@RequestParam(name = "user") String user) {
        return ResponseEntity.ok().body(bonusPointsService.check(user));
    }

}
