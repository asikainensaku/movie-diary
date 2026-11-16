package hh.backend.moviediary;

import hh.backend.moviediary.domain.Movie;
import hh.backend.moviediary.domain.MovieRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

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
			Genre crime = new Genre("Crime");
			Genre drama = new Genre("Drama");
			Genre horror = new Genre("Horror");
			Genre romance = new Genre("Romance");
			Genre thriller = new Genre("Thriller");
			Genre adventure = new Genre("Adventure");
			Genre documentary = new Genre("Documentary");
			Genre fantasy = new Genre("Fantasy");
			Genre musical = new Genre("Musical");
			Genre family = new Genre("Family");
			Genre animation = new Genre("Animation");
			Genre anime = new Genre("Anime");

			if (genreRepository.count() == 0) {
				genreRepository.save(sciFi);
				genreRepository.save(action);
				genreRepository.save(comedy);
				genreRepository.save(crime);
				genreRepository.save(drama);
				genreRepository.save(horror);
				genreRepository.save(romance);
				genreRepository.save(thriller);
				genreRepository.save(adventure);
				genreRepository.save(documentary);
				genreRepository.save(fantasy);
				genreRepository.save(musical);
				genreRepository.save(family);
				genreRepository.save(animation);
				genreRepository.save(anime);

				movieRepository.save(
						new Movie("Interstellar", "Christopher Nolan", 2014, LocalDate.of(2026, 11, 10), 5,
								"Amazing movie!", sciFi));
				new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001,
						LocalDate.of(2026, 8, 12), 5, "An amazing fantasy adventure!", fantasy);

				new Movie("The Conjuring", "James Wan", 2013, LocalDate.of(2026, 7, 5), 4,
						"A genuinely scary horror movie.", horror);

				new Movie("Pulp Fiction", "Quentin Tarantino", 1994, LocalDate.of(2026, 6, 18), 5,
						"Great dialogue and unforgettable characters.", crime);

				new Movie("The Grand Budapest Hotel", "Wes Anderson", 2014, LocalDate.of(2026, 5, 22), 4,
						"Beautiful visuals and a very entertaining story.", comedy);

				new Movie("Gladiator", "Ridley Scott", 2000, LocalDate.of(2026, 4, 10), 5,
						"An epic historical action movie.", action);

				new Movie("Spirited Away", "Hayao Miyazaki", 2001, LocalDate.of(2026, 3, 14), 5,
						"A beautiful and imaginative animated film.", animation);

				new Movie("The Notebook", "Nick Cassavetes", 2004, LocalDate.of(2026, 2, 8), 4,
						"A touching romantic story.", romance);

			}
		};
	}
}
