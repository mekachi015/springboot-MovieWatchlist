package com.example.demo.Entity;

import jakarta.persistence.*;

public class Watchlist {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String movieTitle;

    @Column(nullable = false)
    private String movieGenre;

    @Column(nullable = false)
    private String movieRating;

    @Column(nullable = false)
    private String relDate;



    //getters and setters that get the id
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    //Getters and Setters that get the user
    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    //Getters and setters that get the movie title
    public String getMovieTitle(){
        return movieTitle;
    }

    public void setMovieTitle (String movieTitle){
        this.movieTitle = movieTitle;
    }

    //Getters and Setters that get the movie genre
    public String getMovieGenre(){
        return  movieGenre;
    }

    public void setMovieGenre (String movieGenre){
        this.movieGenre = movieGenre;
    }

    //Getters and setters that get the movie Rating
    public String getMovieRating(){
        return movieRating;
    }

    public void setMovieRating (String movieRating){
        this.movieRating = movieRating;
    }

    public String getRelDate() {
        return relDate;
    }

    public void setRelDate(String relDate) {
        this.relDate = relDate;
    }
}
