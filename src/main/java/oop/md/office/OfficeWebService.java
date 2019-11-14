package oop.md.office;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping("office")
public class OfficeWebService {
    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }
    @GetMapping("/employees")
    public List<String> employeesList(){
        return List.of("Ion","Andrei","Robert","Vlad","Ioana");
    }
    @GetMapping("/directors")
    public List<String> directorsList(){
        return List.of("Mihai","Eugen","Vadim","Radu","Petrea");
    }


}