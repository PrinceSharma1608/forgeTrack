package com.tata.Machine.API;

import com.tata.Machine.db.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class DataApi {

    @Autowired
    private MachineRepository machineRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private PartRepository partRepository;


    @PostMapping("/machines")
    public Machine addMachine(@RequestBody Machine newMachine) {
        return machineRepository.save(newMachine);
    }

    @PostMapping("/users")
    public Users addUser(@RequestBody Users newUser) {
        return usersRepository.save(newUser);
    }

    @PostMapping("/areas")
    public Areas addArea(@RequestBody Areas newArea) {
        return areaRepository.save(newArea);
    }

    @PostMapping("/parts")
    public Part addPart(@RequestBody Part newPart) {
        return partRepository.save(newPart);
    }
}
