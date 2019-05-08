package com.gec.dao;

import java.util.List;

import com.gec.domain.Cource;

public interface CourceMapper {
	public Cource getCourceById(Integer id);
	
	public boolean saveCource(Cource cource);
	
	public boolean delCourceById(Integer id);
	
	public List<Cource> getCourceList();
}
