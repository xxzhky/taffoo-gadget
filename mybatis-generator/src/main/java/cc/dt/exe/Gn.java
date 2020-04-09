/**
 * Copyright (C), 2012-2022，DapTech.
 * @title Gn.java
 * @package cc.exe
 * @Description 
 * @author RID
 * @date Sat, 25 Feb 2017 23:16:03, GMT+8
 * @date 2017.02.25 23:16:03 GMT+8
 * @version v1.0
 * History:
 *	1. Date: 2017年2月25日 下午11:16:03
 *     Author: RID
 *     Modification: TODO
 *  2. ...
 */
package cc.dt.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @name Gn
 * @description TODO
 * @author RID
 * @date Sat, 25 Feb 2017 23:16:03
 *
 */
public class Gn {
	public static void main(String[] args) {
		/**
		 * cmd /c dir 是执行完dir命令后关闭命令窗口。
		 * cmd /k dir 是执行完dir命令后不关闭命令窗口。
		 * cmd /c start dir 会打开一个新窗口后执行dir指令，原窗口会关闭。
		 * cmd /k start dir 会打开一个新窗口后执行dir指令，原窗口不会关闭。
		 * String cmd = “cmd /c D: && cd D:\\img && dir /b”;
		 * 从D盘copy一份文件到E盘，
		 *  String cmdStr = "cmd /c copy d:\\test.txt e:\\" ;
		 * 因为copy本身不是一个可执行的exe文件，需要在前面添加cmd /c来启动一个控制台应用程序，
		 * 而若要运行一个可执行程序， String cmdStr = "F:\\apache-tomcat-6.0.20.exe"; refer to test1() 
		 *  String cmdStr = "cmd /c del e:\\test.txt" ; --删除一个文件
		 * 强制删除e:/test文件夹下的所有文件夹及文件 
		 *  String cmdStr = "cmd /c rd/s/q e:\\test" ;
		 */
		String xmlDir ="E:\\workspace\\taffoo\\mybatis-generator\\src\\main\\java\\cc\\exe";
		String jarpath= "E:\\Tool\\eclipse-jee-neon-2\\apache-maven-3.3.9\\repository\\org\\mybatis\\generator\\mybatis-generator-core\\1.3.2\\mybatis-generator-core-1.3.2.jar";
		String jarCmd = "java -jar " +jarpath+ " -configfile generatorConfig.xml -overwrite";
		Runtime run = Runtime.getRuntime();
		BufferedReader br = null;
		try {
			//调用批处理代码: String path = "D:\\public.bat";   
			String cmd = "cmd /c E: && cd "+xmlDir+" && "+ jarCmd;
			
			Process process = run.exec(cmd);
			System.out.println(cmd);
			
			br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
			//process.waitFor();
            String currDir ="/workspace/taffoo/mybatis-generator/src/main/resources/mybatis";
            process = run.exec("cmd /c cd "+ currDir +" && dir /b");
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("xml: "+line);
            }
            
            process.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void gDao() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		/*
		 * 返回对创建的进程的管理对象
		 */
		// Process p = runtime.exec("mspaint.exe");
		// Thread.sleep(10000);
		// 杀死刚才创建的进程，打开资源管理器，10秒钟后进程消失
		// p.destroy();
		//java -jar mybatis-generator-core-1.3.2.jar -configfile generator.xml -overwrite
		/*
		 * 还可以用指定方式打开文件 默认是在当前目录找，但是eclipse里面有个src 在eclipse里会去src的上层目录找
		 */
		runtime.exec("notepad.exe src/net/xsoftlab/baike/RuntimeDemo.java");
	}

}