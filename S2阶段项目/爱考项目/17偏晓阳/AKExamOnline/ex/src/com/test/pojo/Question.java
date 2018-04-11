package com.test.pojo;



/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question  implements java.io.Serializable {


    // Fields    

     private Integer qid;
     private String type;
     private String content;
     private String optionA;
     private String optionB;
     private String optionC;
     private String optionD;
     private String hard;
     private String charpter;
     private String answer;
     private Integer suid;
     private String stype;

     private String suName;
    // Constructors

    /** default constructor */
    public Question() {
    }

	/** minimal constructor */
    public Question(Integer qid, String type, String content, String optionA, String optionB, String optionC, String optionD, String hard, String charpter, String answer, Integer suid) {
        this.qid = qid;
        this.type = type;
        this.content = content;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.hard = hard;
        this.charpter = charpter;
        this.answer = answer;
        this.suid = suid;
    }
    
    /** full constructor */
    public Question(Integer qid, String type, String content, String optionA, String optionB, String optionC, String optionD, String hard, String charpter, String answer, Integer suid, String stype) {
        this.qid = qid;
        this.type = type;
        this.content = content;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.hard = hard;
        this.charpter = charpter;
        this.answer = answer;
        this.suid = suid;
        this.stype = stype;
    }

   
    // Property accessors

    public Integer getQid() {
        return this.qid;
    }
    
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getOptionA() {
        return this.optionA;
    }
    
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return this.optionB;
    }
    
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return this.optionC;
    }
    
    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return this.optionD;
    }
    
    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getHard() {
        return this.hard;
    }
    
    public void setHard(String hard) {
        this.hard = hard;
    }

    public String getCharpter() {
        return this.charpter;
    }
    
    public void setCharpter(String charpter) {
        this.charpter = charpter;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getSuid() {
        return this.suid;
    }
    
    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public String getStype() {
        return this.stype;
    }
    
    public void setStype(String stype) {
        this.stype = stype;
    }

    
	public String getSuName() {
		return suName;
	}

	public void setSuName(String suName) {
		this.suName = suName;
	}
   








}