package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MainTypeModel;

@Repository("mainTypeRepository")
public interface MainTypeRepository extends CrudRepository<MainTypeModel,Integer> {

}
