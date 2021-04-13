package com.example.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.dao.DaoImplementation;
@Service
public class ServiceImplementation  implements ServiceInterface{
@Autowired
DaoImplementation daoImplementation;

public String welcomeGreetings() {
	return daoImplementation.welcomeGreetings();
}
	

}
