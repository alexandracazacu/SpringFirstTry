package oop.md.office;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipment")
public class EquipmentWebService {
    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }
    @GetMapping("/computers")
    public List<String> computersList(){
        return List.of("Lenovo","Dell","MacBook","HP");
    }
    @GetMapping("/TVs")
    public List<String> TVsList(){
        return List.of("LG","Samsung","Philips");
    }

    @PostMapping("/add/{computersName}")
    public void add(@PathVariable("computersName") String computersName){
        System.out.println(computersName);
    }

}