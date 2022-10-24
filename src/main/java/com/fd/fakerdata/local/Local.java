package com.fd.fakerdata.local;

/**
 * @ClassName Local
 * @Description TODO
 * @Author hujiaoxiang
 * @Date 2022/10/24
 * @Version 1.0
 */
public class Local {
    private final String local;
    private final static String defaultLocal = "zh-cn";

    public Local() {
        this.local = defaultLocal;
    }

    public Local(String local) {
        this.local = local;
    }

    public String getLocalPrefix() {
        return local;
    }
}
