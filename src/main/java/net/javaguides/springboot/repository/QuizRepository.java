package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.exam.Category;
import net.javaguides.springboot.model.exam.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
	public List<Quiz> findByCategory(Category category);
	
	
	public List<Quiz> findByActive(boolean b);
	
	public List<Quiz> findByCategoryAndActive(Category c, boolean b);
}
