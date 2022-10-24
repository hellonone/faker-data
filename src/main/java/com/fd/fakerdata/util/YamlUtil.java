package com.fd.fakerdata.util;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @ClassName YamlUtil
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class YamlUtil {
    public static Map<String, List<String>> getYamlMap(String fileName) {
        Yaml yaml = new Yaml();
        InputStream in = YamlUtil.class
                .getClassLoader()
                .getResourceAsStream(fileName);
        return yaml.load(in);
    }
}
