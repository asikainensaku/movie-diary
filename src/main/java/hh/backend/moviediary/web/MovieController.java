package hh.backend.moviediary.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.backend.moviediary.domain.GenreRepository;
import hh.backend.moviediary.domain.Movie;
import hh.backend.moviediary.domain.MovieRepository;

@Controller
public class MovieController {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;

    public MovieController(MovieRepository movieRepository, GenreRepository genreRepository) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
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
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("genres", genreRepository.findAll());
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
