
#第一种方式：通过Main方法执行配置文件。
GenMain.java
#第二种方式：通过或直接使用Maven插件运行。
运行方法： 1.在eclipse 中，选择pom.xml文件，击右键先择Run AS——>Maven Build… ——>在Goals框中输入：mybatis-generator:generate
 <properties> <dao.target.dir>src/main/java</dao.target.dir>
	   2.mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate -Dconfigfile=generatorConfig.xml
	   mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate -Dconfigfile=generatorConfigOfPeggy.xml
#第三种方式：通过命令行/ant插件运行。
同cc.ee.Gn.java

####2017-6-29
官方配置 http://www.mybatis.org/generator/configreference/xmlconfig.html

####update logs：
查询：http://blog.csdn.net/abcd898989/article/details/51316612
/mybatis-generator/src/main/resources/generatorConfig.xml
修改该文件，增加1） <properties 2） <plugin type= 3）分页插件，<plugin type="org.mybatis.generator.plugins.RowBoundsPlugin"></plugin>

