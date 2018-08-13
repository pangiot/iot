package com.iot.util;



public class ByteUtil {

    public static int[] convert(byte[] data){
        int[] returndata=new int[data.length];
        for(int i=0;i<data.length;i++){
            if(data[i]<0){
                returndata[i]=data[i]&0xff;
            }
            else {
                returndata[i]=data[i];
            }
        }

        return  returndata;
    }
}
