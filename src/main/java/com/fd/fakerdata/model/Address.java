package com.fd.fakerdata.model;

import com.fd.fakerdata.enums.AddressEnum;
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
        return getProvince(AddressEnum.Name);
    }

    public String getProvince(AddressEnum addressEnum) {
        List<Object> provinces = ConvertUtil.castList(map.get("province"), Object.class);
        return getValueSingle(addressEnum, provinces);
    }

    public String getCity(String provinceCode, AddressEnum addressEnum) {
        if (provinceCode == null) {
            provinceCode = getProvince(AddressEnum.Code);
        }
        if (addressEnum == null) {
            addressEnum = AddressEnum.Name;
        }
        List<Object> cities = ConvertUtil.castList(ConvertUtil.castMap(map.get("city"), String.class, List.class).get(provinceCode), Object.class);
        return getValueSingle(addressEnum, cities);
    }

    public String getCity() {
        return getCity(null, null);
    }

    public String getCity(String cityCode) {
        return getCity(cityCode, null);
    }

    public String getCity(AddressEnum addressEnum) {
        return getCity(null, addressEnum);
    }

    public String getCounty(String cityCode, AddressEnum addressEnum) {
        if (cityCode == null) {
            cityCode = getCity(AddressEnum.Code);
        }
        if (addressEnum == null) {
            addressEnum = AddressEnum.Name;
        }
        List<Object> counties = ConvertUtil.castList(ConvertUtil.castMap(map.get("county"), String.class, List.class).get(cityCode), Object.class);
        return getValueSingle(addressEnum, counties);
    }

    public String getCounty() {
        return getCounty(null, null);
    }

    public String getFullAddress() {
        return "";
    }

    private String getValueSingle(AddressEnum addressEnum, List<Object> counties) {
        Object valueFromList = RandomUtil.getValueFromList(counties);
        Map<String, String> city = ConvertUtil.castMap(valueFromList, String.class, String.class);
        switch (addressEnum) {
            case Code:
                return city.get("id");
            case Name:
            default:
                return city.get("name");
        }
    }
}
