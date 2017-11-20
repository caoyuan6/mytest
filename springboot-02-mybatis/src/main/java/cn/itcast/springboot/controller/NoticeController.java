package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.domain.Notice;
import cn.itcast.springboot.service.NoticeService;

/**   
* @Title: NoticeController.java 
* @Package cn.itcast.springboot.controller 
* @Description:Notice的Controller
* @author 曹源
* @date 2017年11月19日 下午8:35:54 
*/
@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@PostMapping("findByPage")
	public Map<String,Object> findByPage(Integer page , Integer rows){
		return noticeService.findByPage(page, rows);
	}

}
