package com.example.best_blog_writer_game.repository;

import com.example.best_blog_writer_game.model.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogEntryRepository extends JpaRepository <BlogEntry, Long> {
  @Query(value = "SELECT * FROM blog_entry ORDER BY REFERENCES DESC LIMIT 10", nativeQuery = true)
    List<BlogEntry> findTopEntries();

}



/*
* @Repository: This annotation marks the interface BlogEntryRepository as a Spring repository. It indicates that this interface defines a repository bean that will handle data access operations related to a certain entity or entities.
extends JpaRepository<BlogEntry, Long>: This part of the code declares that BlogEntryRepository extends the JpaRepository interface. The JpaRepository is a generic interface provided by Spring Data JPA, which provides methods for common CRUD (Create, Read, Update, Delete) operations on entities. It also provides methods for pagination and sorting.
BlogEntry: This specifies the entity class managed by this repository, i.e., BlogEntry. This indicates that this repository will handle data access operations related to BlogEntry entities.
Long: This specifies the type of the primary key of the entity (BlogEntry). In this case, it indicates that the primary key of BlogEntry is of type Long.*/
