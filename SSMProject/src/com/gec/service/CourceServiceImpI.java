package com.gec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.dao.CourceMapper;
import com.gec.domain.Cource;
@Service
public class CourceServiceImpI implements CourceService {

	@Autowired
	private CourceMapper courceMapper;
	
	@Override
	public Cource getCourceById(Integer id) {
				return courceMapper.getCourceById(id) ;
	}
	@Override
	public boolean saveCource(Cource cource) {
		Cource c1 = new Cource(10, "java程序设计");
		Cource c2 = new Cource(11, "C++程序设计");
		courceMapper.saveCource(c1);
		//未发生阻塞情况
		//System.out.println(5/0);
		courceMapper.saveCource(c2);
		return false;
	}
	@Override
	public boolean delCourceById(Integer id) {
			return false;
	}
	@Override
	public List<Cource> getCourceList() {
				return null;
	}

}
