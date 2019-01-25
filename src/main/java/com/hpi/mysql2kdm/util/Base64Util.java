package com.hpi.mysql2kdm.util;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
    /**
     * @param bytes
     * @return byte[]
     */
    public static byte[] decode(final byte[] bytes) {
        return Base64.decodeBase64(bytes);
    }

    /**
     * 二进制数据编码为BASE64字符串
     *
     * @param bytes
     * @return String
     */
    public static String encode(final byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }
}
