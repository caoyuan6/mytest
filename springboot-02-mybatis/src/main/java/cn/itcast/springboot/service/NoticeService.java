package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.domain.Notice;

/**   
* @Title: NoticeService.java 
* @Package cn.itcast.springboot.service 
* @Description: Notice的service接口
* @author 曹源
* @date 2017年11月19日 下午8:33:13 
*/

public interface NoticeService {
	
	List<Notice> findAll();
	
	/** 分页查询查询 */
	Map<String ,Object> findByPage(Integer page , Integer rows);

}
