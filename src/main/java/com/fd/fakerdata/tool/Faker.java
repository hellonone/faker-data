package com.fd.fakerdata.tool;

import com.fd.fakerdata.local.Local;
import com.fd.fakerdata.model.Address;
import com.fd.fakerdata.model.Name;
import com.fd.fakerdata.model.PhoneNumber;

/**
 * @ClassName Faker
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class Faker {
    private final Local local;

    public Faker() {
        this.local = new Local();
    }

    public Faker(Local local) {
        this.local = local;
    }

    public String getLocalPrefix() {
        return local.getLocalPrefix();
    }

    public Name name() {
        return new Name(this);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(this);
    }

    public Address address() {
        return new Address(this);
    }
}
