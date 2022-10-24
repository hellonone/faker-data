package com.fd.fakerdata;

import com.fd.fakerdata.local.Local;
import com.fd.fakerdata.model.Address;
import com.fd.fakerdata.model.Name;
import com.fd.fakerdata.model.PhoneNumber;
import com.fd.fakerdata.tool.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class FakerDataApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testFaker1() {
        Faker faker = new Faker(new Local("zh-cn"));
        Name name = faker.name();
        System.out.println(name.getName());

        PhoneNumber phoneNumber = faker.phoneNumber();
        System.out.println(phoneNumber.getCellPhoneNumber());
        System.out.println(phoneNumber.getPhoneNumber());

        Address address = faker.address();
        address.getProvince();
    }

    @Test
    public void testCLass() {
        Map<String, String> map1 = new HashMap<>();
    }
}
