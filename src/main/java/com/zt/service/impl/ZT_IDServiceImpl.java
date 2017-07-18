package com.zt.service.impl;

import com.sun.jna.ptr.IntByReference;
import com.zt.constants.DeviceCode;
import com.zt.entity.CardInfo;
import com.zt.entity.ReturnObject;
import com.zt.library.ZT_IDLibrary;
import com.zt.service.ZT_IDService;

/**
 * Created by MAX on 2017/7/17.
 */
public class ZT_IDServiceImpl implements ZT_IDService {

    private static ZT_IDLibrary INSTANCE = null;

    static {
        INSTANCE = ZT_IDLibrary.INSTANCE;
        if (null == INSTANCE) {
            try {
                throw new Exception(DeviceCode.ZTIDStatusCode.ID_ERR_LOADDLL_ERROR.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ReturnObject ZT_ID_OpenDevice(int nPort, IntByReference nHandle, int nType) {
        int result = INSTANCE.ZT_ID_OpenDevice(nPort,nHandle,nType);
        int value = 0;
        if(0 == result){
            value = nHandle.getValue();
        }
        return new ReturnObject<Integer>(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result),value);
    }

    public ReturnObject ZT_ID_CloseDevice(int nHandle) {
        int result = INSTANCE.ZT_ID_CloseDevice(nHandle);
        return new ReturnObject(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result));
    }

    public ReturnObject ZT_ID_Reset(int nHandle) {
        int result = INSTANCE.ZT_ID_Reset(nHandle);
        return new ReturnObject(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result));
    }

    public ReturnObject ZT_ID_GetStatus(int nHandle) {
        int result = INSTANCE.ZT_ID_GetStatus(nHandle);
        return new ReturnObject(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result));
    }

    public ReturnObject ZT_ID_Read(int nHandle, int timeout, String[] cardInfo) {
        int result = INSTANCE.ZT_ID_Read(nHandle,timeout,cardInfo);
        CardInfo  info = null;
        if(0 == result && cardInfo != null && cardInfo.length == 9){
            info = new CardInfo(cardInfo[0],cardInfo[1],cardInfo[2],
                    cardInfo[3],cardInfo[4],cardInfo[5],
                    cardInfo[6],cardInfo[7],cardInfo[8]);
        }
        return new ReturnObject<CardInfo>(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result),info);
    }

    public ReturnObject ZT_ID_FindID(int nHandle) {
        int result = INSTANCE.ZT_ID_FindID(nHandle);
        return new ReturnObject(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result));
    }

    public ReturnObject ZT_ID_GetData(int nHandle, int nNum, String cardInfo) {
        int result = INSTANCE.ZT_ID_GetData(nHandle,nNum,cardInfo);
        return new ReturnObject<String>(result,DeviceCode.ZTIDStatusCode.getMessageByCode(result),
                DeviceCode.ZTIDStatusCode.getNameByCode(result),cardInfo);
    }
}
