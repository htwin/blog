app.service('navigationService',function($http){
	//加载导航条列表
	this.findAll = function(){
		return $http.get("../navigation/findAll.do")
	}
});