package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "M")
public class M {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="mid")
	private int id;
	@Column(name="name")
	private String name;
	
	 @ManyToMany(targetEntity = S.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "maintype_subtype",
     joinColumns = { @JoinColumn(name = "mid",referencedColumnName = "mid") },
     inverseJoinColumns = { @JoinColumn(name = "sid",referencedColumnName = "sid") })
     private List<S> s;

}
