package com.fd.fakerdata.model;

import com.fd.fakerdata.rereg.model.Node;
import com.fd.fakerdata.rereg.model.OrdinaryNode;
import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.util.RandomUtil;

import java.util.List;

/**
 * @ClassName PhoneNumber
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class PhoneNumber extends BaseModel {
    public PhoneNumber(Faker faker) {
        super(faker);
    }

    public String getCellPhoneNumber() {
        List<String> cellPhoneNumbers = map.get("cell_phone");
        return numberIfy(RandomUtil.getValueFromList(cellPhoneNumbers));
    }

    public String getPhoneNumber() {
        List<String> phoneNumbers = map.get("phone_number");
        return numberIfy(RandomUtil.getValueFromList(phoneNumbers));
    }

    public String numberIfy(String reg) {
        try {
            Node node = new OrdinaryNode(reg);
            return node.random();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
