app.service("blogService",function($http){
	//查询博客列表
	this.findBlogList = function(page,rows){
		return $http.get("./blog1/getBlogList.do?page="+page+"&rows="+rows);
	}
	
	//根据id查询博客详细内容
	this.findBlogById = function(blogId){
		return $http.get("./blog1/getBlogById.do?blogId="+blogId);
	}
	
	this.findBlogListByTypeId = function(page,rows,typeId){
		return $http.get("./blog1/getBlogListByTypeId.do?typeId="+typeId+"&page="+page+"&rows="+rows);
	}
});