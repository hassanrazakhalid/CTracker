package com.CTracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTracker.Entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
