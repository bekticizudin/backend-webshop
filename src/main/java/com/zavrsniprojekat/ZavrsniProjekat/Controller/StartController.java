package com.zavrsniprojekat.ZavrsniProjekat.Controller;

    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

@RestController
    public class StartController {

        @GetMapping("/start")
        public String startPage() {
            return "Welcome to Tech Store";
        }
    }
