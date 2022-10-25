package com.fd.fakerdata;

import com.fd.fakerdata.model.Address;
import com.fd.fakerdata.model.Email;
import com.fd.fakerdata.model.Name;
import com.fd.fakerdata.model.PhoneNumber;
import com.fd.fakerdata.tool.Faker;
import com.fd.fakerdata.tool.Local;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class FakerDataApplicationTests {
    private final Faker faker = new Faker(new Local("zh-cn"));

    @Test
    void contextLoads() {
    }

    @Test
    public void testFaker1() {
        Name name = faker.name();
        System.out.println(name.getName());

        PhoneNumber phoneNumber = faker.phoneNumber();
        System.out.println(phoneNumber.getCellPhoneNumber());
        System.out.println(phoneNumber.getPhoneNumber());

        Address address = faker.address();
        System.out.println(address.getProvince());
        System.out.println(address.getCity());
        System.out.println(address.getCounty());
        System.out.println(address.getFullAddress());
    }

    @Test
    public void testEmail() {
        Email email = faker.email();
        System.out.println(email.getEmail());
    }@Test
    public void testName() {
        Name name = faker.name();
        System.out.println(name.getUsername());
        System.out.println(name.getAge());
    }

    @Test
    public void testCLass() {
        Map<String, String> map1 = new HashMap<>();
    }
}
