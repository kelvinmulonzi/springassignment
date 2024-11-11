package com.example.SringAssignment.Repository;



import com.example.SringAssignment.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Book, Long> {

}
