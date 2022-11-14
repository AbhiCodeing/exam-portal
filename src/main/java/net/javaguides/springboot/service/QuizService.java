package net.javaguides.springboot.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.model.exam.Category;
import net.javaguides.springboot.model.exam.Quiz;

public interface QuizService {
	
	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set<Quiz> getQuiz();
	
	public Quiz getQuiz(Long quizId);
	
	public void deleteQuiz(Long quizId);

	public List<Quiz> getQuizzesOfCategory(Category category);
	
	public List<Quiz> getActiveQuizzes();
	
	public List<Quiz> getActiveQuizzesOfCategory(Category c);

	

}
