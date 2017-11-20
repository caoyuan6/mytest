package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.domain.Notice;

/**   
* @Title: NoticeMapper.java 
* @Package cn.itcast.springboot.mapper 
* @Description: notice的mapper映射接口
* @author 曹源
* @date 2017年11月19日 下午8:30:43 
*/
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();
	
	/** 统计查询 */
	Integer count();
	
	/** 分页查询 */
	List<Notice> findByPage(@Param("page")Integer page, @Param("rows")Integer rows);

}
