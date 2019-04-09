app.controller('navigationController',function($scope,$location,navigationService){
	$scope.navigationList = [];//初始化导航对象
	$scope.findAll = function(){
		navigationService.findAll().success(
				function(response){
					$scope.navigationList = response;
				}
		);
	}
});