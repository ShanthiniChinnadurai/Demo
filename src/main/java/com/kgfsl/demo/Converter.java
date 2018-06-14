package com.kgfsl.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Converter {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id; 
        @Column
        private String language;
        
        @Column
        private String question; 

        @Column
        private String code;
         
        @Column
        private String option1;
                 
        @Column
        private String option2;
                 
        @Column
        private String option3;
                 
        @Column
        private String option4;



  /**
   * @param id the id to set
   */
  public void setId(Long id) {
      this.id = id;
  }
  /**
   * @return the id
   */
  public Long getId() {
      return id;
  }  
  /**
   * @param language the language to set
   */
  public void setLanguage(String language) {
      this.language = language;
  }
  /**
   * @return the language
   */
  public String getLanguage() {
      return language;
  }
  /**
   * @param question the question to set
   */
  public void setQuestion(String question) {
      this.question = question;
  }
  /**
   * @return the question
   */
  public String getQuestion() {
      return question;
  }
  /**
   * @param code the code to set
   */
  public void setCode(String code) {
      this.code = code;
  }
  /**
   * @return the code
   */
  public String getCode() {
      return code;
  }
  /**
   * @param option the option to set
   */
  public void setOption1(String option1) {
      this.option1 = option1;
  }
  /**
   * @return the option
   */
  public String getOption1() {
      return option1;
  }    
  /**
   * @param option2 the option2 to set
   */
  public void setOption2(String option2) {
      this.option2 = option2;
  }
  /**
   * @return the option2
   */
  public String getOption2() {
      return option2;
  }
  /**
   * @param option3 the option3 to set
   */
  public void setOption3(String option3) {
      this.option3 = option3;
  }
  /**
   * @return the option3
   */
  public String getOption3() {
      return option3;
  }
  /**
   * @param option4 the option4 to set
   */
  public void setOption4(String option4) {
      this.option4 = option4;
  }
  /**
   * @return the option4
   */
  public String getOption4() {
      return option4;
  }
 
    
}