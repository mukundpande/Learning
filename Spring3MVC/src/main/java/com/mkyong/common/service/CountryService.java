package com.mkyong.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkyong.common.model.Country;

@Service
public interface CountryService {
	public List<Country> getAllCountries();
	
	public List<Country> getAllCountriesFromProcedure();
}