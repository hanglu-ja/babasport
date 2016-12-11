package cn.itcast.core.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * 测试
 * @author lx
 *
 */
@Controller
public class CenterController {


	@RequestMapping(value="/test/springmvc.do")
	public String add(String name,Date birthday){
		System.out.println();
		return "";
	}

/*	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	*/
	@RequestMapping(value="/control/index.do")
	public String index(){
		return "index";
	}
}
