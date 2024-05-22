package com.example.demo.Controller;

import com.example.demo.Entity.Watchlist;
import com.example.demo.Services.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class WatchlistController {

    @Autowired
    private WatchlistService watchlistService;

    @PostMapping("/add")
    public ResponseEntity<Watchlist> addToWacthlist(@RequestParam String username, @RequestParam String item){
        return ResponseEntity.ok(watchlistService.addToWacthlist(username, item));
    }

    @DeleteMapping("/delete/{id}")
    public ReponseEntity<Void> deleteFromWacthlist(@PathVariable Long id)
    {
        watchlistService.deleteFromWatchlist(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping ("/{username}")
    public ResponseEntity<List<Watchlist>>getWatchlist(@PathVariable String username){
        return ResponseEntity.ok(WatchlistService.getWathlist(username));
    }
}
