package cc.dt.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @projectName: peggy-contract-claim
 * @package: com.souche.peggy.contract.claim.support.mybatis.plugin
 * @className: IngoreSetterAndGetterPlugin
 * @author: dujian
 * @date: 2020-03-06
 * @description: mybatis-generator 插件生成Model时忽略Getter/Setter的插件
 * @version: 1.0
 */
public class IgnoreSetterAndGetterPlugin extends PluginAdapter {
    //@Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        //该代码表示在生成class的时候，向topLevelClass添加一个@Setter和@Getter注解
        return super.modelBaseRecordClassGenerated(topLevelClass,
                introspectedTable);
    }

    /**
     * 该方法在生成每一个属性的getter方法时候调用，如果我们不想生成getter，直接返回false即可；
     *
     * @param method
     * @param topLevelClass
     * @param introspectedColumn
     * @param introspectedTable
     * @param modelClassType
     * @return
     */
    @Override
    public boolean modelGetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
        return false;
    }

    /**
     * 该方法在生成每一个属性的setter方法时候调用，如果我们不想生成setter，直接返回false即可；
     *
     * @param method
     * @param topLevelClass
     * @param introspectedColumn
     * @param introspectedTable
     * @param modelClassType
     * @return
     */
    @Override
    public boolean modelSetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
        return false;
    }
}