package net.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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

import net.javaguides.springboot.model.exam.Question;
import net.javaguides.springboot.model.exam.Quiz;
import net.javaguides.springboot.service.QuestionService;
import net.javaguides.springboot.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/")
	public ResponseEntity<Question> addQuestion(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.questionService.addQuestion(question));
	}
	
	@PutMapping("/")
	public ResponseEntity<Question> updateQuestion(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.questionService.addQuestion(question));
	}
	
	//get all question of any quiz
	@GetMapping("/quiz/{qId}")
	public ResponseEntity<?> getQuestionOfQuiz(@PathVariable("qId") Long qId)
	{
		/*
		 * Quiz quiz=new Quiz(); quiz.setqId(qId); Set<Question>
		 * questionOfQuiz=this.questionService.getQuestionOfQuiz(quiz); return
		 * ResponseEntity.ok(questionOfQuiz);
		 */
		Quiz quiz=this.quizService.getQuiz(qId);
		Set<Question> questions=quiz.getQuestions();
		List list=new ArrayList(questions);
		
		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestion()))
		{
			list=list.subList(0,Integer.parseInt(quiz.getNumberOfQuestion()+1));
		}
		Collections.shuffle(list);
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping("/quiz/all/{qId}")
	public ResponseEntity<?> getQuestionOfAdmin(@PathVariable("qId") Long qId)
	{
		
		  Quiz quiz=new Quiz();
		  quiz.setqId(qId);
		  Set<Question> questionOfQuiz=this.questionService.getQuestionOfQuiz(quiz);
		  return ResponseEntity.ok(questionOfQuiz);
		
		
	}
	
	
	
	
	
	@GetMapping("/{quesId}")
	public Question get(@PathVariable("quesId") Long quesId)
	{
		return this.questionService.getQuestion(quesId);
	}
	
	@DeleteMapping("/{quesId}")
	public void deleteQuestion(@PathVariable("quesId") Long quesId)
	{
		this.questionService.deleteQuestion(quesId);
	}
	
	
	
	
}
