package com.common;

/**
 * @author xiang.wei
 * @date 2020/3/10 9:20 AM
 */
public class StringTest {
    public static void main(String[] args) {
        String orgStr = "201203";
            System.out.println("截取后的字符串是：" +(orgStr.length()>=8?orgStr.substring(0, 8):orgStr));
    }
}
