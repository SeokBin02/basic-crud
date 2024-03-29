package com.example.postcrud.repository;

import com.example.postcrud.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();
    Optional<Post> findByIdAndUserid(Long id, Long userId);
    Optional<Post> deleteByIdAndUserid(Long id, Long userId);
}
