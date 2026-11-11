package hh.backend.moviediary.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.backend.moviediary.domain.MovieRepository;

@Controller
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/moviediary")
    public String moviediary() {
        return "moviediary"; // moviediary.html
    }

    @GetMapping("/movielist")
    public String movielist(Model model) {
        model.addAttribute("movies", movieRepository.findAll());
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
