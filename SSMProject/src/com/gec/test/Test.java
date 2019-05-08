package com.gec.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class Test {
	//Listener<T>
	//ContextLoaderListener
	DispatcherServlet ds;
	InternalResourceViewResolver is;
	JstlView h;
//	DataSource
	//BasicDataSource
	SqlSessionFactoryBean s;
	//DataSourceTransactionManager
	//mapperLocation
	//文件上传
	CommonsMultipartResolver multipartResolver;
	MapperScannerConfigurer c;
	{
		//c.setSqlSessionFactoryBeanName(sqlSessionFactoryName);
	}
}
