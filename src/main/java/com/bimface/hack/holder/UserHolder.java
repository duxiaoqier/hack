package com.bimface.hack.holder;

import com.bimface.hack.bean.User;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户集合，key为sessionId
 *
 * @author dup, 2017-11-24
 */
public class UserHolder {
    public static final ConcurrentHashMap<String, User> userMap = new ConcurrentHashMap<>();
}
