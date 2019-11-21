package oop.md.office;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipment")
public class EquipmentWebService {
    private String TVsName;
    Computers ListOfComputers = new Computers();

    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }


    @GetMapping("/computers")
    public List<String> studentsList() {
        return ListOfComputers.getComputers();
    }

    @PostMapping("/addComputers/{name}")
    public void addComputers(@PathVariable String name){
        ListOfComputers.addComputers(name);
    }

    @PutMapping("/addComputers/{name}")
    public List<String> getComputers(@PathVariable("name") String name){
        ListOfComputers.computers.add(name);
        return(ListOfComputers.computers);
    }

    @DeleteMapping("delComputers/{name}")
    public void delComputers(@PathVariable("name") String name){
        ListOfComputers.delComputers(name);

    }
}