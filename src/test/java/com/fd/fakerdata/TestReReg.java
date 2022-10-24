package com.fd.fakerdata;

import com.fd.fakerdata.rereg.exception.RegexpIllegalException;
import com.fd.fakerdata.rereg.exception.TypeNotMatchException;
import com.fd.fakerdata.rereg.exception.UninitializedException;
import com.fd.fakerdata.rereg.model.Node;
import com.fd.fakerdata.rereg.model.OrdinaryNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName TestReReg
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
@SpringBootTest
public class TestReReg {
    @Test
    public void generateReg() {
        try {
            String expression = "(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}";
            Node node = new OrdinaryNode(expression);
            String random = node.random();
            System.out.println(random);
        } catch (RegexpIllegalException | TypeNotMatchException | UninitializedException e) {
            throw new RuntimeException(e);
        }
    }
}
