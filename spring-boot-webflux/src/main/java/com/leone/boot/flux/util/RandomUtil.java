package com.leone.boot.flux.util;

import java.util.Random;
import java.util.UUID;

/**
 * @author leone
 * @since 2018-07-04
 **/
public class RandomUtil {

    /**
     * 生成随机字符串
     *
     * @param length
     * @return
     */
    public static String getNum(Integer length) {
        if (length < 0 && length > 512) {
            length = 32;
        }
        StringBuilder result = new StringBuilder();
        final String sources = "0123456789";
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(sources.charAt(rand.nextInt(9)));
        }
        return result.toString();
    }

    /**
     * 生成32位随机数字
     *
     * @param length
     * @return
     */
    public static String getStr(Integer length) {
        if (length <= 0 || length > 32) {
            length = 32;
        }
        return UUID.randomUUID().toString().replace("-", "").substring(0, length);
    }

    /**
     * 获取当前时间戳，单位秒(10位)
     **/
    public static long getTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    public static void main(String[] args) {
        System.out.println(getStr(34));
        System.out.println(getNum(35));
    }


}
