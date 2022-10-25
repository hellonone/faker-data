package com.fd.fakerdata.util;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @ClassName YamlUtil
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class YamlUtil {
    public static Map<String, Object> getYamlMap(String fileName) {
        Yaml yaml = new Yaml();
        InputStream in = null;
        try {
            in = YamlUtil.class
                    .getClassLoader()
                    .getResourceAsStream(fileName);

            return yaml.load(in);
        } catch (Exception e) {
            throw new RuntimeException("没有发现这个" + fileName + "文件");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
