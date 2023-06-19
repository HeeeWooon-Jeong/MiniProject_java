package model;

import java.util.ArrayList;

public class ArrayGenre {
	    public ArrayList<QuestionDTO> questionList;
	    
	    public ArrayGenre() {
	        questionList = new ArrayList<>();
	    }
	    
	    public void addQuestion(QuestionDTO question) {
	        questionList.add(question);
	    }
	    
	    public ArrayList<QuestionDTO> getQuestionList() {
	        return questionList;
	    }
	    
	    // 기타 필요한 메서드들을 추가로 구현합니다.
	}
	
	
	

