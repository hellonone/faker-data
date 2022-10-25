package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.ConvertUtil;
import com.fd.fakerdata.util.RandomUtil;
import com.fd.fakerdata.util.ReRegUtil;

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
        List<String> lastNames = ConvertUtil.castList(map.get("last_name"), String.class);
        List<String> firstNames = ConvertUtil.castList(map.get("first_name"), String.class);
        String lastName = RandomUtil.getValueFromList(lastNames);
        String firstName = RandomUtil.getValueFromList(firstNames);
        return lastName + firstName;
    }

    public String getUsername() {
        List<String> usernames = ConvertUtil.castList(map.get("username"), String.class);
        String usernameReg = RandomUtil.getValueFromList(usernames);
        return ReRegUtil.getStringByReg(usernameReg);
    }

    public String getAge() {
        List<String> ages = ConvertUtil.castList(map.get("age"), String.class);
        String usernameReg = RandomUtil.getValueFromList(ages);
        return ReRegUtil.getStringByReg(usernameReg);
    }
}
