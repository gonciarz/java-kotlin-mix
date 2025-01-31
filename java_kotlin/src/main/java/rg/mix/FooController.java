package rg.mix;

import org.springframework.web.bind.annotation.*;

@RestController
public class FooController {

    @GetMapping("/foo")
    public String foo() {
        return "foo";
    }

}
