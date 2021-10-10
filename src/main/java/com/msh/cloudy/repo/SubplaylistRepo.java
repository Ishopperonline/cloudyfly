package com.msh.cloudy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msh.cloudy.dao.SubPlaylistEntity;

@Repository
public interface SubplaylistRepo extends JpaRepository<SubPlaylistEntity, Integer> {

	List<SubPlaylistEntity> findByMainplaylistId(Integer mainPlaylistId);
}
