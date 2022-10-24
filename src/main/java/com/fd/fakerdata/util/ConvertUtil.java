package com.fd.fakerdata.util;

import java.util.*;

/**
 * @ClassName ConvertUtil
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class ConvertUtil {
    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        List<T> result = new ArrayList<T>();
        if (obj instanceof List<?>) {
            for (Object o : (List<?>) obj) {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return null;
    }

    public static <T, K> Map<T, K> castMap(Object obj, Class<T> clsT, Class<K> clsK) {
        Map<T, K> map = new HashMap<>();
        if (obj instanceof Map<?, ?>) {
            Map<?, ?> mapTemp = (Map<?, ?>) obj;
            Set<?> keys = mapTemp.keySet();
            for (Object key : keys) {
                map.put(clsT.cast(key), clsK.cast(mapTemp.get(key)));
            }
            return map;
        }
        return null;
    }
}
