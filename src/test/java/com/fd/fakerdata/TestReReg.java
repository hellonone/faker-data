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
            String expression = "[\u4e00-\u9fa5]";
            Node node = new OrdinaryNode(expression);
            String random = node.random();
            System.out.println(random);
        } catch (RegexpIllegalException | TypeNotMatchException | UninitializedException e) {
            throw new RuntimeException(e);
        }
    }
}
