package ch.bbw.form_greetings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GreetingsController {
    private ArrayList<Greeting> allGreetings = new ArrayList<>(); // data that has been entered

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(Model model, @ModelAttribute Greeting greeting) {
        greeting.setReceiveTime();
        allGreetings.add(greeting);

        model.addAttribute("greeting", greeting);
        model.addAttribute("allGreetings", allGreetings);

        return "result";
    }

    @ModelAttribute("allTypes")
    public List<String> populateGreetingTypes(@ModelAttribute Greeting greeting) {
        return Arrays.asList( greeting.getAllTypes() );
    }
}
