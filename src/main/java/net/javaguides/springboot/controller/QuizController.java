package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.exam.Category;
import net.javaguides.springboot.model.exam.Quiz;
import net.javaguides.springboot.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/")
	public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz)
	{
		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	}
	
	
	@PutMapping("/")
	public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz)
	{
		return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getQuiz()
	{
		return ResponseEntity.ok(this.quizService.getQuiz());
	}
	
	@GetMapping("/{qId}")
	public Quiz quiz(@PathVariable("qId") Long qId)
	{
		return this.quizService.getQuiz(qId);
	}
	
	@DeleteMapping("/{qId}")
	public void deleteQuiz(@PathVariable("qId") Long qId)
	{
		this.quizService.deleteQuiz(qId);
	}
	
	@GetMapping("/category/{cId}")
	public List<Quiz> getQuizzesOfCategories(@PathVariable("cId") Long cId)
	{
		Category category=new Category();
		category.setcId(cId);
		return this.quizService.getQuizzesOfCategory(category);
	}
	
	@GetMapping("/active")
	public List<Quiz> getActiveQuizzes()
	{
		return this.quizService.getActiveQuizzes();
	}
	
	@GetMapping("/category/active/{cId}")
	public List<Quiz> getcategoryOfActiveQuizzes(@PathVariable ("cId") Long cId)
	{
		Category category=new Category();
		category.setcId(cId);
		return this.quizService.getActiveQuizzesOfCategory(category);
	}
	

}
