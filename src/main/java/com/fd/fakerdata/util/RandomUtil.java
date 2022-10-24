package com.fd.fakerdata.util;

import java.util.List;
import java.util.Random;

/**
 * @ClassName RandomUtil
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class RandomUtil {
    public static Random random = new Random();

    public static Object getValueFromList(List<Object> list) {
        int index = random.nextInt(list.size());
        return list.get(index);
    }

    public static int nextInt(int begin, int end) {
        return random.nextInt(end - begin) + begin;
    }
}
