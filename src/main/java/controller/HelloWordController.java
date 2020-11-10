package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWordController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello word";
    }

    @RequestMapping(value = "drnick")
    public String getHelloDrnick(){
        return "Hello every body";
    }
    @PostMapping("/postMapping")
    public String getPostMapping(){
        return "Post mapping";
    }
}
