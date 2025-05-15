package com.fernandopaniagua.getafe.ifct0062_2025_testws.repository;

import com.fernandopaniagua.getafe.ifct0062_2025_testws.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
}
