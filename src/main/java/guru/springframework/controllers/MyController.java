package guru.springframework.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public void hello() {
        System.out.println("Hello tout le monde!!!");
    }

}
