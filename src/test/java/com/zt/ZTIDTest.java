package com.zt;

import com.sun.jna.ptr.IntByReference;
import com.zt.entity.ReturnObject;
import com.zt.service.impl.ZT_IDServiceImpl;

/**
 * Created by MAX on 2017/7/17.
 */
public class ZTIDTest {

    public static void main(String[] args) {
        ZT_IDServiceImpl idService = new ZT_IDServiceImpl();

//        ReturnObject returnObject = idService.ZT_ID_OpenDevice(1, new IntByReference(),1);
        ReturnObject returnObject = idService.ZT_ID_CloseDevice(1);

        System.out.println(returnObject);
    }
}
