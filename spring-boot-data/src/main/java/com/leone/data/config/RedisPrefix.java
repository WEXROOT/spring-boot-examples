package com.leone.data.config;

/**
 * @author Leone
 * @since 2018-07-08
 **/
public class RedisPrefix {

    public static String userCatch(String uuid) {
        return "app.user:" + uuid;
    }

}
