package SpringBoot6.src.main.java.com.example.SpringBoot6.Controller;


@RestController
public class Controller {

    @GetMapping("/prueba")

    public String prueba {
            return "prueba2"
    }
    
}
