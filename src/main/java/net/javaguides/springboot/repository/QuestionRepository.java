package net.javaguides.springboot.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.exam.Question;
import net.javaguides.springboot.model.exam.Quiz;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
