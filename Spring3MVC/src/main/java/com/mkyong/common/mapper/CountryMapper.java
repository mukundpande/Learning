package com.mkyong.common.mapper;

import java.util.List;

import com.mkyong.common.model.Country;

public interface CountryMapper {
	public List<Country> getAllCountries();
	
	public List<Country> getAllCountriesFromProcedure();
}
