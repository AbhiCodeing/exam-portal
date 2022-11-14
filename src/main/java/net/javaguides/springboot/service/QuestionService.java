package net.javaguides.springboot.service;

import java.util.Set;

import net.javaguides.springboot.model.exam.Question;
import net.javaguides.springboot.model.exam.Quiz;

public interface QuestionService {
	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Question getQuestion(Long questionId);
	
	public Set<Question> getQuestionOfQuiz(Quiz quiz);
	
	public  void deleteQuestion(Long quesId);

}
