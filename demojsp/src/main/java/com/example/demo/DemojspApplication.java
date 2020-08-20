package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.M;
import com.example.demo.model.S;


@SpringBootApplication
public class DemojspApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemojspApplication.class, args);
	}

	

}
