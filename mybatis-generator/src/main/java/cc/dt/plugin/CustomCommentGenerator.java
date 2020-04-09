package cc.dt.plugin;

import cc.dt.utils.ColumnNameUtil;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @projectName: peggy-contract-claim
 * @package: com.souche.peggy.contract.claim.support.mybatis.generator
 * @className: NewbatisGenerator
 * @author: dujian
 * @date: 2020-03-06
 * @description:
 * @version: 1.0
 */
public class CustomCommentGenerator extends DefaultCommentGenerator {
    /**
     * 使用lombok 注解
     */
    boolean useLombokAnnotation = false;
    /**
     * 使用搜车orm注解
     */
    boolean useSoucheOrmAnnotation = false;
    /**
     * 使用swagger的apiModelProperty注解
     */
    boolean useSwaggerApiModelProperty = false;

    String columnNamePrefix = "c_";
    /**
     * 是否在属性上忽略数据表列的前缀
     */
    boolean fieldNameIgnoreColumnPrefix = true;
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;

    public CustomCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    /**
     * 对类的注解
     *
     * @param topLevelClass
     * @param introspectedTable
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * 这是MyBatis Generator自动生成的Model Class.");

        StringBuilder sb = new StringBuilder();
        sb.append(" * 对应的数据表是 : ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(sb.toString());

        String tableRemarks = introspectedTable.getRemarks();
        if (!StringUtils.isEmpty(tableRemarks)) {
            sb.setLength(0);
            sb.append(" * @description : ");
            sb.append(tableRemarks);
            topLevelClass.addJavaDocLine(sb.toString());
        }

        sb.setLength(0);
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        topLevelClass.addJavaDocLine(sb.toString());

        String curDateString = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
        sb.setLength(0);
        sb.append(" * @date ");
        sb.append(curDateString);
        topLevelClass.addJavaDocLine(sb.toString());

        topLevelClass.addJavaDocLine(" */");
        if (useSoucheOrmAnnotation) {
            topLevelClass.addJavaDocLine("@SqlTable(value=\"" + introspectedTable.getFullyQualifiedTable() + "\")");
        }
        List<String> annotations = topLevelClass.getAnnotations();
        if (useLombokAnnotation && !annotations.contains("@Getter")) {
            topLevelClass.addJavaDocLine("@Getter");
            topLevelClass.addImportedType("lombok.Getter");
        }
        if (useLombokAnnotation && !annotations.contains("@Setter")) {
            topLevelClass.addJavaDocLine("@Setter");
            topLevelClass.addImportedType("lombok.Setter");
        }
    }

    /**
     * 生成的实体增加字段的中文注释
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        String fieldName = field.getName();
        if (fieldNameIgnoreColumnPrefix) {
            if (fieldName.startsWith(columnNamePrefix.substring(0, columnNamePrefix.lastIndexOf("_")))
                    && introspectedColumn.getActualColumnName().startsWith(columnNamePrefix)
                    && Character.isUpperCase(fieldName.charAt(1))) {
                fieldName = fieldName.substring(1);
                fieldName = String.valueOf(Character.toLowerCase(fieldName.charAt(0))).concat(fieldName.substring(1));
            }
        }

        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
        if (useSoucheOrmAnnotation) {
            field.addJavaDocLine("@SqlField(value=\"c_" + StringUtils.lowerCase(ColumnNameUtil.humpToUnderline(fieldName)) + "\")");
        }
        if (useSwaggerApiModelProperty) {
            field.addJavaDocLine("@ApiModelProperty(value = \"" + introspectedColumn.getRemarks() + "\")");
        }
        field.setName(fieldName);
    }

}