package com.example.demo.Services;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Watchlist;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WatchlistService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WatchlistRepository watchlistRepository

    public Watchlist addToWacthlist(String username, String item){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        Watchlist watchlist = new Watchlist();
        watchlist.setUser(user);
        watchlist.setMovieTitle();
        watchlist.setMovieGenre();
        watchlist.setMovieRating();
        watchlist.setRelDate();

        return watchlistRepository.save(watchlist);
    }

    public void deleteFromWatchlist (Long watchlistId)
    {
        watchlistRepository.deleteById(watchlistId);
    }

    public List<Watchlist> getWatchlist (String username){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        return watchlistRepository.findByUser(user);
    }
}
