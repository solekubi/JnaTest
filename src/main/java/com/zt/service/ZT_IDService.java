package com.zt.service;

import com.sun.jna.ptr.IntByReference;
import com.zt.entity.ReturnObject;

/**
 * Created by MAX on 2017/7/17.
 */
public interface ZT_IDService{

    //打开设备
    ReturnObject ZT_ID_OpenDevice(int nPort, IntByReference nHandle, int nType);

    //关闭设备
    ReturnObject  ZT_ID_CloseDevice(int nHandle);

    //设备复位
    ReturnObject  ZT_ID_Reset (int nHandle);

    //取得设备状态
    ReturnObject   ZT_ID_GetStatus (int nHandle);

    //读二代证信息
    ReturnObject  ZT_ID_Read(int nHandle, int timeout, String[] cardInfo);

    //查询身份证是否存在
    ReturnObject  ZT_ID_FindID(int nHandle);

    //读二代证信息
    ReturnObject ZT_ID_GetData(int nHandle, int nNum, String cardInfo);
}
