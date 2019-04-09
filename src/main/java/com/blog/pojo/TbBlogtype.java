package com.blog.pojo;

public class TbBlogtype {
    private Integer typeId;

    private String typename;

    private Integer typeorder;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypeorder() {
        return typeorder;
    }

    public void setTypeorder(Integer typeorder) {
        this.typeorder = typeorder;
    }
}