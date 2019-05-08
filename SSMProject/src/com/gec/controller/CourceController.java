package com.gec.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gec.domain.Cource;
import com.gec.service.CourceService;

@Controller
@RequestMapping("/Cource")
public class CourceController {
	@Autowired
	private CourceService courceService;
	
	public CourceController(){
		System.out.println("{debug} IoC 容器创建了: CourceController");
	}
	
	//Link: Cource/getCourceById?id=10  @RequestParam绑定请求的参数
		@RequestMapping("/getCourceById")
		public String getCourceById(@RequestParam("id")Integer id,Map<String,Cource> model) {
			System.out.println("{debug} MVC 调用了:CourceController.getCourceById()");
			System.out.println("{debug} id = "+ id);
			Cource cource = courceService.getCourceById( id );
			model.put("cource", cource);
			System.out.println(cource);
			return "success";
		}
		
		//做事务的测试
		@RequestMapping("/saveCource")
		public String saveCource() {
			courceService.saveCource(null);
			return "success";
			}
		
		//接收文件上传的请求
		@RequestMapping("/Upload")
		public String fileupload(@RequestParam("picfile") MultipartFile picfile) {
			try {
				if(!picfile.isEmpty()) {//文件不为空，说明文件有内容
					byte[] buff = picfile.getBytes();//拿到文件的数据
					String fileName = picfile.getOriginalFilename();//拿到文件名
					writeToFile(buff, fileName);
					return "file_success";
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return "file_err";
			}
		
		//文件上传方法[该方法时针对于小文件来说的]
		public void writeToFile(byte [] data,String fileName) throws Exception {
			String path="E:\\Java\\upload\\success\\"+fileName;
			FileOutputStream os = new FileOutputStream(path);
			os.write(data);
			os.close();
		}
}
