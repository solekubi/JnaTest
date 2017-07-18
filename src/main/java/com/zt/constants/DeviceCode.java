package com.zt.constants;

/**
 * Created by MAX on 2017/7/18.
 */
public class DeviceCode {

    public enum ZTIDStatusCode{
        ERR_NO_ERROR(0,""),
        ID_ERR_LOADDLL_ERROR(-1,"加载驱动库失败"),
        ID_ERR_DEVICE_ERROR(-2,"设备故障"),
        ID_ERR_CHECK_ERROR(-3,"检查二代证错误"),
        ID_ERR_READ_ERROR(-4,"读二代证信息失败"),
        ID_ERR_COMM_ERROR(-5,"串口通信失败"),
        ID_ERR_FOUNDCARD_ERROR(-6,"寻卡失败"),
        ID_ERR_INIT_ERROR(-7,"初始化失败");

        ZTIDStatusCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        private int code;

        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public static String getMessageByCode(int code) {

            for (ZTIDStatusCode errorCode : ZTIDStatusCode.values()) {
                if(code == errorCode.getCode())
                {
                    return errorCode.getMessage();
                }
            }
            return "Unknow Error Code, Please Check again!";
        }
        public static String getNameByCode(int code) {

            for (ZTIDStatusCode errorCode : ZTIDStatusCode.values()) {
                if(code == errorCode.getCode())
                {
                    return errorCode.name();
                }
            }
            return "Unknow Error Code, Please Check again!";
        }
    }
}
