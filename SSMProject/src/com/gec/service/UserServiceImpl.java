package com.gec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.dao.UserMapper;
import com.gec.domain.User;
import com.gec.domain.UserExample;
import com.gec.domain.UserExample.Criteria;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper usermapper;
	@Override
	public User doLogin(User user) {
		//创建条件器
		UserExample exp = new UserExample();
		Criteria criteria = exp.createCriteria();//拿到一个条件器
		criteria.andNameEqualTo(user.getName());
		criteria.andPassEqualTo(user.getPass());
		//拿到一个List集合，注意：这里可能会存在多条记录
		List<User> list = usermapper.selectByExample(exp);
		if(list.size()==1) {
			return list.get(0);//拿到具体的数据
		}
		return null;
	}

}
