/**
 * Copyright (C), 2012-2022，DapTech.
 * @title MysqlPaginationPlugin.java
 * @package cc.dt.plugin
 * @Description 
 * @author RID
 * @date Sat, 1 Jul 2017 02:10:38, GMT+8
 * @date 2017.07.01 02:10:38 GMT+8
 * @version v1.0
 * History:
 *	1. Date: 2017年7月1日 上午2:10:38
 *     Author: RID
 *     Modification: TODO
 *  2. ...
 */
package cc.dt.plugin;

/**
 * @name MysqlPaginationPlugin
 * @description TODO
 * @author RID
 * @date Sat, 1 Jul 2017 02:10:38
 *
 */

import java.util.List;

import org.mybatis.generator.api.CommentGenerator;

import org.mybatis.generator.api.IntrospectedTable;

import org.mybatis.generator.api.PluginAdapter;

import org.mybatis.generator.api.ShellRunner;

import org.mybatis.generator.api.dom.java.Field;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

import org.mybatis.generator.api.dom.java.JavaVisibility;

import org.mybatis.generator.api.dom.java.Method;

import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.PrimitiveTypeWrapper;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import org.mybatis.generator.api.dom.xml.Attribute;

import org.mybatis.generator.api.dom.xml.TextElement;

import org.mybatis.generator.api.dom.xml.XmlElement;

 

/**

 * <pre>

 * add paginationusing mysql limit.2

 * This class isonly used in ibator code generator.

 *[generatorConfiguration]

 *     [context id="context1"]

 *            [plugintype="com.epublic.xzk.db.mybatis.plugin.PaginationPlugin" /]

 *

 * </pre>

*/

public class MysqlPaginationPlugin extends PluginAdapter {

  @Override

  public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable) {

         // addfield, getter, setter for limit clause

         addLimit(topLevelClass,introspectedTable,"offset");

         addLimit(topLevelClass,introspectedTable,"limit");

         return super.modelExampleClassGenerated(topLevelClass,introspectedTable);

  }

 

  @Override

  public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,

                IntrospectedTable introspectedTable) {

         // LIMIT5,10; // 检索记录行 6-15

         /*XmlElement isNotNullElement= new XmlElement("if");//$NON-NLS-1$

         isNotNullElement.addAttribute(new Attribute("test","offset != null and offset >=0"));//$NON-NLS-1$ //$NON-NLS-2$

         isNotNullElement.addElement(new TextElement("limit${offset} , ${limit}"));

         element.addElement(isNotNullElement);*/

         // LIMIT 5;//检索前 5个记录行

         XmlElement ifLimitNotNullElement = new XmlElement("if");
         ifLimitNotNullElement.addAttribute(new Attribute("test", "limit != null  and limit >= 0"));

         XmlElement ifOffsetNotNullElement = new XmlElement("if");
         ifOffsetNotNullElement.addAttribute(new Attribute("test", "offset != null and offset >= 0"));
         ifOffsetNotNullElement.addElement(new TextElement("limit ${offset}, ${limit}"));
         ifLimitNotNullElement.addElement(ifOffsetNotNullElement);

         XmlElement ifOffsetNullElement = new XmlElement("if");
         ifOffsetNullElement.addAttribute(new Attribute("test", "offset == null"));
         ifOffsetNullElement.addElement(new TextElement("limit ${limit}"));
         ifLimitNotNullElement.addElement(ifOffsetNullElement);

         element.addElement(ifLimitNotNullElement);


         return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,introspectedTable);

  }

 

  private void addLimit(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String name){
	  	 
	  PrimitiveTypeWrapper integerWrapper = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();
         CommentGenerator commentGenerator =context.getCommentGenerator();

         Field field= new Field();

         field.setVisibility(JavaVisibility.PROTECTED);

         field.setType(integerWrapper);

         field.setName(name);

         //field.setInitializationString("-1");

         commentGenerator.addFieldComment(field,introspectedTable);

         topLevelClass.addField(field);
         
         

         char c =name.charAt(0);

         String camel= Character.toUpperCase(c) +name.substring(1);

         Method method= new Method();

         method.setVisibility(JavaVisibility.PUBLIC);

         method.setName("set" +camel);

         method.addParameter(new Parameter(integerWrapper,name));

         method.addBodyLine("this." +name+ "=" +name+ ";");

         commentGenerator.addGeneralMethodComment(method,introspectedTable);

         topLevelClass.addMethod(method);
         

         method= new Method();

         method.setVisibility(JavaVisibility.PUBLIC);

         method.setReturnType(integerWrapper);

         method.setName("get" +camel);

         method.addBodyLine("return " +name+ ";");

         commentGenerator.addGeneralMethodComment(method,introspectedTable);

         topLevelClass.addMethod(method);

  }

 

  /**

   * This plugin is always valid -no properties are required

   */

  public boolean validate(List<String>warnings) {

         return true;

  }

 

  public static void generate() {

         String config= MysqlPaginationPlugin.class.getClassLoader().getResource("mybatisConfig.xml").getFile();

         String[] arg= { "-configfile", config, "-overwrite"};

         ShellRunner.main(arg);

  }

 

  public static void main(String[] args) {

         generate();

  }

}