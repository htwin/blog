app.controller("blogController", function($scope, $location,blogTypeService, blogService) {
	$scope.blogList = [];
	$scope.blogType = {};
	$scope.findBlogList = function(page,rows) {
		$scope.typeId = $location.search()['typeId'];
		if ($scope.typeId == null) {
			blogService.findBlogList(page,rows).success(function(response) {
				$scope.blogList = response.list;
				$scope.pageNum = response.pageNum;
				$scope.currentPage = response.currentPage;
				//创建页码数组。用于页面angularjs遍历显示页码  ps:这个方法好像有点不妥，没办法时间有限
				var pageList = new Array($scope.pageNum);
				for(var i =0;i<pageList.length;i++){
					pageList[i] = i+1;
				}
				$scope.pageList = pageList;
			});
		}else{
			//存在typeId，根据分类查询博客列表，并且回显分类名称
			blogService.findBlogListByTypeId(page,rows,$scope.typeId).success(function(response) {
				$scope.blogList = response.list;
				$scope.pageNum = response.pageNum;
				$scope.currentPage = response.currentPage;
				//创建页码数组。用于页面angularjs遍历显示页码  ps:这个方法好像有点不妥，没办法时间有限
				var pageList = new Array($scope.pageNum);
				for(var i =0;i<pageList.length;i++){
					pageList[i] = i+1;
				}
				$scope.pageList = pageList;
			});
			//回显分类名称
			blogTypeService.findBlogTypeByTypeId($scope.typeId).success(
					function(response){
						$scope.blogType = response;
					}
			);
		}
	}

	// 显示blog详细内容
	$scope.blog = {};
	$scope.showContent = function() {
		$scope.blogId = $location.search()['blogId'];
		blogService.findBlogById($scope.blogId).success(function(response) {
			$scope.blog = response;
			$(function() {
				$("#content").html($scope.blog.content);
			});
		});
	}
	
	
});