package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.ConvertUtil;
import com.fd.fakerdata.util.RandomUtil;
import com.fd.fakerdata.util.ReRegUtil;

import java.util.List;

/**
 * @ClassName Email
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/25
 * @Version 1.0
 */
public class Email extends BaseModel {

    public Email(Faker faker) {
        super(faker);
    }

    public String getEmail() {
        List<String> suffixes = ConvertUtil.castList(map.get("suffix"), String.class);
        List<String> prefixes = ConvertUtil.castList(map.get("prefix"), String.class);
        String randomPrefix = RandomUtil.getValueFromList(prefixes);
        String randomSuffix = RandomUtil.getValueFromList(suffixes);
        String stringByReg = ReRegUtil.getStringByReg(randomPrefix);
        return stringByReg + "@" + randomSuffix;
    }
}
