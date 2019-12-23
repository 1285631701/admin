package com.qingnang.admin.vo;

import java.util.List;

/**   
* Copyright: Copyright (c) 2018
* @ClassName: MenuVo.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月21日 下午3:33:51 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月21日       feri           v1.0.0               修改原因
*/
public class MenuVo {
	private int id;
	private String icon;
	private String name;
	private boolean ischild;
	private List<MenuItem> childs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIschild() {
		return ischild;
	}
	public void setIschild(boolean ischild) {
		this.ischild = ischild;
	}
	public List<MenuItem> getChilds() {
		return childs;
	}
	public void setChilds(List<MenuItem> childs) {
		this.childs = childs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof MenuVo) {
			MenuVo mo=(MenuVo)obj;
			return this.id==mo.getId();
		}else {
			return false;
		}
	}

	
}
