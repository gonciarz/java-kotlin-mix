package rg.mix;

import org.springframework.web.bind.annotation.*;

@RestController
public class BarController {

    @GetMapping("/bar")
    public Bar bar() {
        return new Bar("bob");
    }

}
