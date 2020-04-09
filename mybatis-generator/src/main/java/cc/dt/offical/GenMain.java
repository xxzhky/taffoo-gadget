/**
 * Copyright (C), 2012-2022，DapTech.
 * @title GenMain.java
 * @package cc.offical
 * @Description 
 * @author RID
 * @date Thu, 29 Jun 2017 19:30:09, GMT+8
 * @date 2017.06.29 19:30:09 GMT+8
 * @version v1.0
 * History:
 *	1. Date: 2017年6月29日 下午7:30:09
 *     Author: RID
 *     Modification: TODO
 *  2. ...
 */
package cc.dt.offical;

import java.io.File;  
import java.io.IOException;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
  
import org.mybatis.generator.api.MyBatisGenerator;  
import org.mybatis.generator.config.Configuration;  
import org.mybatis.generator.config.xml.ConfigurationParser;  
import org.mybatis.generator.exception.InvalidConfigurationException;  
import org.mybatis.generator.exception.XMLParserException;  
import org.mybatis.generator.internal.DefaultShellCallback;  
  
public class GenMain {  
    public static void main(String[] args) {  
        List<String> warnings = new ArrayList();
        boolean overwrite = true;  
        //String genCfg = "/mbgConfiguration.xml";
        String genCfg = "/generatorConfigOfPeggy.xml";
        //genCfg = "/generatorConfig.xml";
        File configFile = new File(GenMain.class.getResource(genCfg).getFile());  
        ConfigurationParser cp = new ConfigurationParser(warnings);  
        Configuration config = null;  
        try {  
            config = cp.parseConfiguration(configFile);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (XMLParserException e) {  
            e.printStackTrace();  
        }  
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
        MyBatisGenerator myBatisGenerator = null;  
        try {  
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);  
        } catch (InvalidConfigurationException e) {  
            e.printStackTrace();  
        }  
        try {  
            myBatisGenerator.generate(null);  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}