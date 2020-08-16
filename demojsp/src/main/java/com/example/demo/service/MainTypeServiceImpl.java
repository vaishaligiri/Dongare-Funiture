package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MainTypeModel;
import com.example.demo.repository.MainTypeRepository;

@Service("mainTypeService")
public class MainTypeServiceImpl implements MainTypeService {

	@Autowired
	MainTypeRepository mainTypeRepository;

	@Override
	public boolean isAddMainType(MainTypeModel model) {
		// TODO Auto-generated method stub
		MainTypeModel m = mainTypeRepository.save(model);
		if (m != null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public List<MainTypeModel> getAllMainTypes() {
		// TODO Auto-generated method stub
		List<MainTypeModel> list=mainTypeRepository.findAll();//select *from tablename
		System.out.println(list);
		return list;
	}

}
