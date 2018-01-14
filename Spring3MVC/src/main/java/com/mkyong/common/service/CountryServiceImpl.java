package com.mkyong.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.common.mapper.CountryMapper;
import com.mkyong.common.model.Country;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryMapper countryMapper;

	public List<Country> getAllCountries() {
		return this.countryMapper.getAllCountries();
	}

	@Override
	public List<Country> getAllCountriesFromProcedure() {
		return this.countryMapper.getAllCountriesFromProcedure();
	}
	
	
}
