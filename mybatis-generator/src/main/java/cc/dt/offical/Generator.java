package cc.dt.offical;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
//import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: peggy-contract-claim
 * @package: com.souche.peggy.contract.claim.support.mybatis.generator
 * @className: Generator
 * @author: dujian
 * @date: 2020-03-06
 * @description:
 * @version: 1.0
 */
@Slf4j
public class Generator {
    static final String configFilePath = "/generatorConfigOfPeggy.xml";

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile = //new ClassPathResource(configFilePath).getFile();
                new File(GenMain.class.getResource(configFilePath).getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        try {
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(new ProgressCallback() {
                public void introspectionStarted(int totalTasks) {
                    log.info("introspectionStarted totalTasks:{} ", totalTasks);
                }

                public void generationStarted(int totalTasks) {
                    log.info("generationStarted totalTasks:{} ", totalTasks);
                }

                public void saveStarted(int totalTasks) {
                    log.info("saveStarted totalTasks:{} ", totalTasks);
                }

                public void startTask(String taskName) {
                    log.info("taskName:{} started", taskName);
                }

                public void done() {

                }

                public void checkCancel() throws InterruptedException {

                }
            });
        } catch (Exception e) {
            log.error("发生异常", e);
        }
    }
}