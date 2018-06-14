package com.kgfsl.demo;
import com.kgfsl.demo.Conversionservice;

import java.util.List;

import com.kgfsl.demo.ConversionRespository;
import com.kgfsl.demo.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("Conversionservice")
public class ConversionserviceImp implements Conversionservice{
    @Autowired 
    private ConversionRespository repo;

	@Override
	public void saveRegister(Converter register) {
		repo.save(register);
	}
	@Override
	public Converter findOne(long id) {
		return repo.findOne(id);
	}
	@Override
	public List<Converter> findAll() {
		return repo.findAll();
	}


}