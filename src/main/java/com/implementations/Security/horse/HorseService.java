package com.implementations.Security.horse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseService {

    @Autowired
    HorseRepository horseRepository;


    public List<Horse> findAll() {
        return horseRepository.findAll();
    }

    public Horse saveHorse(Horse horse) {
        return horseRepository.save(horse);
    }
}
