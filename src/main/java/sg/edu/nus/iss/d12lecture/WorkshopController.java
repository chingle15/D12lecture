package sg.edu.nus.iss.d12lecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/workshop" })
public class WorkshopController {
    
    public String test() {
        return "workshop";
    }
    
}
