package com.mohen.crm.utils;

import com.mohen.crm.exceptions.ParamsException;

/**
 * @author MH19
 */
public class AssertUtil {


    public  static void isTrue(Boolean flag,String msg){
        if(flag){
            throw  new ParamsException(msg);
        }
    }

}
