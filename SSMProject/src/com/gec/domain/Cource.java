package com.gec.domain;

import org.springframework.stereotype.Component;

@Component("cource")
public class Cource {
	private Integer id;
	private String courceName;
	
	public Cource(){
		System.out.println("{debug} 调用了 Cource 无参构造器");
	}
	public Cource(Integer id,String courceName ){
		this.id=id;
		this.courceName=courceName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourceName() {
		return courceName;
	}
	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}
	@Override
	public String toString() {
		return "Cource [id=" + id + ", courceName=" + courceName + "]";
	}
}
