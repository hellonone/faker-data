package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.ConvertUtil;
import com.fd.fakerdata.util.RandomUtil;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Address
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class Address extends BaseModel {
    public Address(Faker faker) {
        super(faker);
    }

    public String getProvince() {
        List<Object> provinces = map.get("province");
        Object valueFromList = RandomUtil.getValueFromList(provinces);
        Map<String, String> province = ConvertUtil.castMap(valueFromList, String.class, String.class);
        return province.get("name");
    }

    public String getCity() {
        List<Object> cities = map.get("city");
        System.out.println(cities.get(1));
        return "";
    }

}
