package cn.itcast.springboot.domain;

/**
 * @Title: Notice.java
 * @Package cn.itcast.springboot.domain
 * @Description: notice实体类
 * @author 曹源
 * @date 2017年11月19日 下午8:27:56
 */

public class Notice {

	private Long ID;// bigint(20) not null auto_increment,
	private String CONTENT;// longtext,
	private String TITLE;// varchar(200) default null,

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

}
