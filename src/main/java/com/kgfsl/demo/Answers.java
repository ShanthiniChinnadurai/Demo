package com.kgfsl.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Answers {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id; 
        @Column
        private String correctanswer;

        /**
         * @param id the id to set
         */
        public void setId(Integer id) {
            this.id = id;
        }
        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }
        /**
         * @param correctanswer the correctanswer to set
         */
        public void setCorrectanswer(String correctanswer) {
            this.correctanswer = correctanswer;
        }
        /**
         * @return the correctanswer
         */
        public String getCorrectanswer() {
            return correctanswer;
        }
    }
