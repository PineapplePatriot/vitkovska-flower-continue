package ucu.edu.ua.flowercontinue.flowers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Moved to flowers due to issues, still is in a different package

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(0.8, FlowerColor.RED, 45, FlowerType.ROSE)
        );
    }
}
