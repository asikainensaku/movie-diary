package hh.backend.moviediary;

import hh.backend.moviediary.domain.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.backend.moviediary.domain.Genre;
import hh.backend.moviediary.domain.GenreRepository;

@SpringBootApplication
public class MovieDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDiaryApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(GenreRepository genreRepository, MovieRepository movieRepository) {
		return args -> {

			// luodaan genret
			Genre sciFi = new Genre("Sci-Fi");
			Genre action = new Genre("Action");
			Genre comedy = new Genre("Comedy");

			if (genreRepository.count() == 0) {
				genreRepository.save(sciFi);
				genreRepository.save(action);
				genreRepository.save(comedy);
			}
		};
	}
}
