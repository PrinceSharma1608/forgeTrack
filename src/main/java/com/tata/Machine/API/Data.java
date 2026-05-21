package com.tata.Machine.API;
import com.tata.Machine.DTO.usersDTO;
import com.tata.Machine.db.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/modify")
public class Data {

    @Autowired
    private MachineRepository machineRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private AreaRepository areaRepository;

    @PostMapping("/machines")
    public List<Machine> addMachines(
            @RequestBody List<Machine> machines)
    {
        return machineRepository.saveAll(machines);
    }

    @PostMapping("/users")
    public List<Users> addUsers(
            @RequestBody List<Users> users) {
        return usersRepository.saveAll(users);
    }

    @PostMapping("/areas")
        public List<Areas> addAreas(@RequestBody List<Areas> areas) {
        return areaRepository.saveAll(areas);
    }
    @GetMapping("/area-supervisor")
    public List<Object[]> getAreaSupervisor() {
        return areaRepository.getAreaSupervisorMap();
    }

    @GetMapping("/worker-machine-map")
    public List<Object[]> getWorkerMachineMap() {
        return machineRepository.getWorkerMachineMap();
    }

    @GetMapping("/overdue-machines")
    public List<Object[]> getOverdueMachines() {
        return machineRepository.getOverdueMachines();
    }

    @GetMapping("/today-maintenance")
    public List<Object[]> getTodayMaintenance() {
        return machineRepository.getTodayMaintenance();
    }

    @PostMapping("/cleanup")
    public void cleanupHistory() {
        machineRepository.cleanupHistory();
    }

    @GetMapping("/users")

    public List<usersDTO> getAllUsers()
    {
        List<Users> users = usersRepository.findAll();

        return users.stream()
                .map(user -> new usersDTO(
                        user.getUserTkt(),
                        user.getUserName(),
                        user.getUserRole().toString()
                ))
                .toList();
    }

    @DeleteMapping("/users/{id}")

    public String deleteUser(
            @PathVariable Integer id)
    {
        usersRepository.deleteById(id);

        return "User deleted successfully";
    }
}