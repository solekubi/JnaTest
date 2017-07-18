package com.zt.library;

import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;
import com.zt.constants.DllPath;

/**
 * Created by sole on 2017/7/17 0017.
 */
public interface ZT_IDLibrary extends StdCallLibrary{

    ZT_IDLibrary INSTANCE = Native.loadLibrary(DllPath.ZT_ID_PATH,ZT_IDLibrary.class);

    //打开设备
    int ZT_ID_OpenDevice(int nPort, IntByReference nHandle, int nType);

    //关闭设备
    int  ZT_ID_CloseDevice(int nHandle);

    //设备复位
    int  ZT_ID_Reset (int nHandle);

    //取得设备状态
    int   ZT_ID_GetStatus (int nHandle);

    //读二代证信息
    int  ZT_ID_Read(int nHandle, int timeout, String[] cardInfo);

    //查询身份证是否存在
    int  ZT_ID_FindID(int nHandle);

    //读二代证信息
    int  ZT_ID_GetData(int nHandle, int nNum, String cardInfo);
}


