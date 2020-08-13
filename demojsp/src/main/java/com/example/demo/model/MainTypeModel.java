package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="maintype")
public class MainTypeModel {

	@Column(name="maintypename")
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="maintypeid")
	private int id;
	
}
