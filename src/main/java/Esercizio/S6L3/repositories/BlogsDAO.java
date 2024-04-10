package Esercizio.S6L3.repositories;

import Esercizio.S6L3.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BlogsDAO extends JpaRepository<Blog, UUID> {
    boolean exixstByTitle(String titolo);
    Optional<Blog> findByTitle(String titolo);

}
