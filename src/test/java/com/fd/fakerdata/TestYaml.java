package com.fd.fakerdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

/**
 * @ClassName TestYaml
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
@SpringBootTest
public class TestYaml {
    @Test
    public void testYaml() {
        Yaml yaml = new Yaml();
        InputStream in = this.getClass()
                .getClassLoader()
                .getResourceAsStream("zh-cn/name.yml");
        Map map = yaml.loadAs(in, Map.class);
        System.out.println(map);
    }

    @Test
    public void testClass() {
        System.out.println(this.getClass());
    }
}
