package hh.backend.moviediary.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import hh.backend.moviediary.domain.Movie;

import hh.backend.moviediary.domain.MovieRepository;
import hh.backend.moviediary.domain.GenreRepository;

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

    @PostMapping("/save")
    public String saveMovie(Movie movie) {
        if (movie.getGenre() != null) {
            movie.setGenre(
                    genreRepository.findById(movie.getGenre().getId()).get());
        }

        movieRepository.save(movie);
        return "redirect:/movielist";
    }

    @GetMapping("/edit/{id}")
    public String editMovie(@PathVariable("id") Long id, Model model) {
        model.addAttribute("movie", movieRepository.findById(id).get());
        model.addAttribute("genres", genreRepository.findAll());
        return "editmovie"; // editmovie.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html
    }
}
