package com.dlx.onemediapieceservlet.dao;

import java.util.ArrayList;
import java.util.List;

public interface Dao<T> {

	T save(T t);
	
	T update(T t);
	
	T delete(T t);
	
	List<T> findAll(ArrayList<T> list);
	
	T find(long id);

}
