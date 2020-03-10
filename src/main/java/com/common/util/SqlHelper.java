package com.common.util;

/**
 * Created by xiang.wei on 2018/10/26
 *
 * @author xiang.wei
 */
public class SqlHelper {
    public static boolean retBool(Integer result) {
        return null != result && result.intValue() >= 1;
    }

}
