package com.msh.cloudy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msh.cloudy.dao.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

	
}
