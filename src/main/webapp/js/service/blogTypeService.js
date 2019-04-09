app.service("blogTypeService",function($http){
	this.findTypeList = function(){
		return $http.get("./blogType/getTechnologyTypeList.do");
	}
	
	this.findBlogTypeByTypeId = function(typeId){
		return $http.get("./blogType/getBlogTypeByTypeId.do?typeId="+typeId);
	}
	
});