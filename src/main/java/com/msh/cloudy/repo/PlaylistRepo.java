package com.msh.cloudy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msh.cloudy.dao.Playlist;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {

	
}
