package com.implementations.Security.horse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horse")
public class HorseController {

    @Autowired
    HorseService horseService;

    @GetMapping
    public List<Horse> findAll() {
        return horseService.findAll();
    }

    @PostMapping
    public Horse saveHorse(@RequestBody Horse horse){
        return horseService.saveHorse(horse);
    }
}
