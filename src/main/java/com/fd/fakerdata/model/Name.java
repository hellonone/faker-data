package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.RandomUtil;

import java.util.List;

/**
 * @ClassName Name
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class Name extends BaseModel {
    public Name(Faker faker) {
        super(faker);
    }

    public String getName() {
        List<String> lastNames = map.get("last_name");
        List<String> firstNames = map.get("first_name");
        return RandomUtil.getValueFromList(lastNames) + RandomUtil.getValueFromList(firstNames);
    }
}
