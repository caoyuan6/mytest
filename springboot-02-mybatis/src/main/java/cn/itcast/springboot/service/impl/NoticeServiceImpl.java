package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.domain.Notice;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.service.NoticeService;

/**   
* @Title: NoticeServiceImpl.java 
* @Package cn.itcast.springboot.service.impl 
* @Description: Notice的service实现类
* @author 曹源
* @date 2017年11月19日 下午8:34:13 
*/
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	/**分页查询 */
	@Override
	public Map<String ,Object> findByPage(Integer page, Integer rows) {
		Map<String ,Object> map = new HashMap<>();
		
		map.put("total", noticeMapper.count());
		map.put("rows", noticeMapper.findByPage((page - 1) * rows, rows));
		
		return map;
	}

}
