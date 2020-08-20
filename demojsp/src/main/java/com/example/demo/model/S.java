package com.example.demo.model;

import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "S")
public class S {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int id;
	@Column(name = "name")
	private String name;

	@ManyToMany(targetEntity = M.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "s")
	private List<MainTypeModel> m;
}
