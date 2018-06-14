package com.kgfsl.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ConversionRespository extends JpaRepository<Converter,Integer> {

	Converter findOne(long id);

	List<Converter> getAll();

}