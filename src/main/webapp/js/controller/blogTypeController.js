app.controller("blogTypeController",function($scope,blogTypeService){
	$scope.typeList = [];
	$scope.findTypeList = function(){
		blogTypeService.findTypeList().success(
				function(response){
					$scope.typeList = response;
				}
		);
	}
});