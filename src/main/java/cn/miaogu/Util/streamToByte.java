package cn.miaogu.Util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * @Author 一直都是大番茄
 * @Time 2020-09-10 22:32
 * @Email 41481601@qq.com
 */
public class streamToByte {
    public static byte[] readStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = inStream.read(buffer)) != -1){
            outStream.write(buffer, 0, len);
        }
        outStream.close();
        inStream.close();
        return outStream.toByteArray();
    }
}
