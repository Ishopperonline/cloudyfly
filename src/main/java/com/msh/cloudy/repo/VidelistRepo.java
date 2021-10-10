package com.msh.cloudy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msh.cloudy.dao.VideolistEntity;

@Repository
public interface VidelistRepo extends JpaRepository<VideolistEntity, Integer> {

	List<VideolistEntity> findBySubplaylistId(Integer subplaylistId);
}
