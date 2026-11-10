package hh.backend.moviediary.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenreController {

    @GetMapping("/genrelist")
    public String genreList() {
        return "genrelist"; // genrelist.html
    }

    @GetMapping("/addgenre")
    public String addGenre() {
        return "addgenre"; // addgenre.html
    }
}
