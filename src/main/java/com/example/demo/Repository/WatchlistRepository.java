package com.example.demo.Repository;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WatchlistRepository extends JpaRepository  <Watchlist, Long>{
    List<Watchlist> findByUser(User user);
}
