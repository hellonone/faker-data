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
        return getProvinceMap().get(addressEnum.getValue());
    }

    private Map<String, String> getProvinceMap() {
        List<Object> provinces = ConvertUtil.castList(map.get("province"), Object.class);
        return getMap(provinces);
    }

    private Map<String, String> getMap(List<Object> areas) {
        Object randomItem = RandomUtil.getValueFromList(areas);
        return ConvertUtil.castMap(randomItem, String.class, String.class);
    }

    private Map<String, String> getCityMap(String provinceCode) {
        if (provinceCode == null) {
            provinceCode = getProvince(AddressEnum.Code);
        }
        Object cityObj = map.get("city");
        List<Object> cities = ConvertUtil.castList(
                ConvertUtil.castMap(cityObj, String.class, List.class).get(provinceCode), Object.class);

        return getMap(cities);
    }

    public String getCity(String provinceCode, AddressEnum addressEnum) {
        if (addressEnum == null) {
            addressEnum = AddressEnum.Name;
        }
        return getCityMap(provinceCode).get(addressEnum.getValue());
    }

    public String getCity() {
        return getCity(null, null);
    }

    public String getCity(AddressEnum addressEnum) {
        return getCity(null, addressEnum);
    }

    private Map<String, String> getCountyMap(String cityCode) {
        if (cityCode == null) {
            cityCode = getCity(AddressEnum.Code);
        }
        List<Object> counties = ConvertUtil.castList(ConvertUtil.castMap(map.get("county")
                , String.class, List.class).get(cityCode), Object.class);
        return getMap(counties);
    }

    public String getCounty(String cityCode, AddressEnum addressEnum) {
        if (addressEnum == null) {
            addressEnum = AddressEnum.Name;
        }
        return getCountyMap(cityCode).get(addressEnum.getValue());
    }

    public String getCounty() {
        return getCounty(null, null);
    }

    public String getFullAddress() {
        Map<String, String> provinceMap = getProvinceMap();
        Map<String, String> cityMap = getCityMap(provinceMap.get(AddressEnum.Code.getValue()));
        Map<String, String> countyMap = getCountyMap(cityMap.get(AddressEnum.Code.getValue()));
        return provinceMap.get(AddressEnum.Name.getValue())
                + cityMap.get(AddressEnum.Name.getValue())
                + countyMap.get(AddressEnum.Name.getValue());
    }
}
