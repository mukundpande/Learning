package com.mkyong.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.common.model.Country;
import com.mkyong.common.service.CountryService;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {
	
	@Autowired
	private CountryService countryService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Country> getCountriesInJson() {
		return countryService.getAllCountries();
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public @ResponseBody List<Country> getAllCountriesFromProcedure() {
		return countryService.getAllCountriesFromProcedure();
	}
}