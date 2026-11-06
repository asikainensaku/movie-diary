package hh.backend.moviediary.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Movie {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private int releaseYear;
    private LocalDate watchedDate;
    private int rating;
    private String review;

    @ManyToOne
    private Genre genre;

    public Movie(String title, String director, int releaseYear, LocalDate watchedDate, int rating, String review,
            Genre genre) {

        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.watchedDate = watchedDate;
        this.rating = rating;
        this.review = review;
        this.genre = genre;
    }

    public Movie() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setWatchedDate(LocalDate watchedDate) {
        this.watchedDate = watchedDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public LocalDate getWatchedDate() {
        return watchedDate;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", releaseYear=" + releaseYear
                + ", watchedDate=" + watchedDate + ", rating=" + rating + ", review=" + review + "]";
    }

}
