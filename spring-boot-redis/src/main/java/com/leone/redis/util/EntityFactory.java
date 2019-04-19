package com.leone.redis.util;

import com.leone.redis.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *
 * @author Leone
 * @since 2018-08-11
 **/
@Slf4j
public class EntityFactory {

    private static final String jsonUserData = "{\"username\":\"james\",\"password\":\"admin\",\"email\":\"andy@163.com\",\"token\":\"token:12idkail8lld\",\"salary\":10004,\"birthday\":\"2018-04-02\"}";

    private static Random random = new Random();

    /**
     * 获取object数据格式数据
     *
     * @param count
     * @return
     */
    public static List<User> getUsers(Integer count) {
        List<User> userList = new ArrayList<>();
        for (long i = 0; i < count; i++) {
            User user = new User(1L, RandomUtil.getName(), RandomUtil.getStr(12), RandomUtil.getUser().toString(), 1 + random.nextInt(90), new Date(), false);
            userList.add(user);
        }
        return userList;
    }

    /**
     * 获取一个object
     *
     * @return
     */
    public static User getUser() {
        return new User(1L, RandomUtil.getName(), RandomUtil.getStr(12), RandomUtil.getUser().toString(), 1 + random.nextInt(90), new Date(), false);
    }

    /**
     * 获取json数据格式数据
     *
     * @return
     */
    public static String getJsonUser() {
        return jsonUserData;
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(getUser()));
    }

}
