package com.kgfsl.demo;


import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface Conversionservice {
    
    public void saveRegister (Converter register);
    public List<Converter> findAll();

	public Converter findOne(long id);
	
 }
    
