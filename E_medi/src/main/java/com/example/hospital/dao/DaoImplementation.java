package com.example.hospital.dao;
import static com.example.hospital.constants.ConstantsHsptl.HAI;

import org.springframework.stereotype.Repository;
@Repository
public class DaoImplementation implements DaoInterface{

	public String welcomeGreetings() {
		return HAI;
	}

		
	}


