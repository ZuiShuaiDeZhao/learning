src
	-main
		-java
			-package
	-test
		-java
			-package
	resources
	
	mvn -v 查看maven版本
	mvn compile 编译
	mvn test 测试
	mvn package 打包
	
	clean 删除target
	install 安装jar包到本地仓库中
	
	创建目录的两种方式：
	1.archetype:generate 按照提示进行
	2.archetype:generate -DgroupId=组织名，公司网址的反写+项目名
						-DartifactId=项目名-模块名
						-Dversion=版本号
						-Dpackage=代码所存在的包名
						