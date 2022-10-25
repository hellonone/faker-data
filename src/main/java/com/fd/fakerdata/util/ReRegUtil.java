package com.fd.fakerdata.util;

import com.fd.fakerdata.rereg.model.Node;
import com.fd.fakerdata.rereg.model.OrdinaryNode;

/**
 * @ClassName ReRegUtil
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/25
 * @Version 1.0
 */
public class ReRegUtil {
    public static String getStringByReg(String reg) {
        try {
            Node node = new OrdinaryNode(reg);
            return node.random();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
