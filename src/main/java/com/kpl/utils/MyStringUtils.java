package com.kpl.utils;

import org.apache.commons.lang3.RandomUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 字符串工具类
 */
public class MyStringUtils {

    /**
     * 字符串切割拼接
     *
     * @param name
     * @return
     */
    public static String CharacterSegmentation(String name) {
        return name + getRandomString();
    }

    public static String getRandomString() {
        String str1 = "⁡";
        String str3 = "⁢";
        int randomNumber = RandomUtils.nextInt(1, 4);
        switch (randomNumber) {
            case 1:
                return str1;
            case 3:
                return str3;
        }
        return str1;
    }




}