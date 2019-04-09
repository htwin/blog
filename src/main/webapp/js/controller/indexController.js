app.controller("indexController",function($scope,blogService,blogTypeService){
	$scope.blogList = [];
	findBlogList = function(){
		blogService.findBlogList().success(
				function(response){
					$scope.blogList = response;
				}
		);
	}
	
	$scope.typeList = [];
	findTypeList = function(){
		blogTypeService.findTypeList().success(
				function(response){
					$scope.typeList = response;
				}
		);
	}
	//首页初始化
	$scope.init = function(){
		//加载博客
		findBlogList();
		//加载分类
		findTypeList();
	}
});