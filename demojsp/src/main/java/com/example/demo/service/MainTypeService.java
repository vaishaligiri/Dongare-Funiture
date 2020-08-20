package com.example.demo.service;

import com.example.demo.model.*;
import java.util.*;
public interface MainTypeService {

	public boolean isAddMainType(MainTypeModel model);
	public List<MainTypeModel>  getAllMainTypes();
	public void isDeleteMainType(int typeid);
}
