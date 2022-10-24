package com.fd.fakerdata.model;

import com.fd.fakerdata.tool.Faker;

import java.util.List;

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
        List<String> province = map.get("province");
        System.out.println(province);
        return "";
    }

}
