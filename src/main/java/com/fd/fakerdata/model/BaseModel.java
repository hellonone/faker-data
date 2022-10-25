package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.YamlUtil;

import java.util.Map;

/**
 * @ClassName BaseModel
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class BaseModel {
    protected final Faker faker;
    protected String fileName;
    protected Map<String, Object> map;

    public BaseModel(Faker faker) {
        this.faker = faker;
        init();
    }

    private void init() {
        String localPrefix = faker.getLocalPrefix();
        String simpleName = this.getClass().getSimpleName().toLowerCase();
        String separator = "/";
        String suffix = ".yml ";
        this.fileName = localPrefix + separator + simpleName + suffix;
        this.map = YamlUtil.getYamlMap(fileName);
    }
}
