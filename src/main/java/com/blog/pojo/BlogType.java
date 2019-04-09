package com.blog.pojo;

/**
 * 博客类别
 * @author 22850
 *
 */
public class BlogType {
	private int typeId;//类别id
	private String typeName;//类别名称
	private int typeOrder;//类别排序
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getTypeOrder() {
		return typeOrder;
	}
	public void setTypeOrder(int typeOrder) {
		this.typeOrder = typeOrder;
	}
	
}
