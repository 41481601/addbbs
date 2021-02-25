package cn.miaogu.Util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

/**
 * @Author 一直都是大番茄
 * @Time 2020-09-02 23:28
 * @Email 41481601@qq.com
 */
public class MD5 {
    /*-----------------------------------------------------摘要  不可解码----------------------------------------------------------------*/
    /**
     *text明文
     *key密钥
     *密文
     */
    // 带秘钥加密
    public static String md5(String text, String key) throws Exception {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex(text + key);
        System.out.println("MD5加密后的字符串为:" + md5str);
        return md5str;
    }

    // 不带秘钥加密
    public static String md52(String text) throws Exception {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex(text);
        System.out.println("MD52加密后的字符串为:" + md5str + "\t长度：" + md5str.length());
        return md5str;
    }


/*-----------------------------------------------------其他加密算法----------------------------------------------------------------*/
    // 可逆的加密算法
    public   static  String KN(String inStr) {
        // String s = new String(inStr);
        char [] a = inStr.toCharArray();
        for  ( int  i =  0 ; i < a.length; i++) {
            a[i] = (char ) (a[i] ^  'p' );
        }
        String s = new  String(a);
        return  s;
    }

    // 加密后解密
    public   static  String JM(String inStr) {
        char [] a = inStr.toCharArray();
        for  ( int  i =  0 ; i < a.length; i++) {
            a[i] = (char ) (a[i] ^  'p' );
        }
        String k = new  String(a);
        return  k;
    }

    /***
     * MD5加码 生成32位md5码
     */
    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }




    public static void main(String[] args) {
        String s = new String("咋");
//        System.out.println("原始：" + s);
        System.out.println("MD5后：" + string2MD5(s));

        String jiamihou = KN(s);
        String jiemi  = JM(jiamihou);
        System.out.println(jiamihou+"-----------"+jiemi);

    }
}
