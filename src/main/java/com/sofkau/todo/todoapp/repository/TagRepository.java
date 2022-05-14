package com.sofkau.todo.todoapp.repository;

import com.sofkau.todo.todoapp.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    public List<Tag> findByNoteId(Long noteId);
}
