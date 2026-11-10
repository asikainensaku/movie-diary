package hh.backend.moviediary.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/moviediary")
    public String moviediary() {
        return "moviediary"; // moviediary.html
    }

    @GetMapping("/movielist")
    public String movielist() {
        return "movielist"; // movielist.html
    }

    @GetMapping("/add")
    public String addMovie() {
        return "addmovie"; // addmovie.html
    }

    @GetMapping("/edit")
    public String editBook() {
        return "editbook"; // editbook.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html
    }
}
