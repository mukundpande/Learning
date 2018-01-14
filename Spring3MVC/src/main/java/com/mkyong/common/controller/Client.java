package com.mkyong.common.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mkyong.common.model.Country;

public class Client {

	public static void main(String[] args) {
		Reader reader;
		try {
 			reader = Resources.getResourceAsReader("mybatis-config.xml");
		
	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
	      SqlSession session = sqlSessionFactory.openSession();
	       
	      List<Country> countries = session.selectList("getAllCountries");
	      for (Country country : countries) {
	    	  System.out.println(country.getCountryId() + " : " + country.getCountryName());
		}
	      session.commit();
	      session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
