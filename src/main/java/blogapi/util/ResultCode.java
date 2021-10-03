package blogapi.util;

/**
 * 返回码 枚举
 * @author junyangwei
 * @date 2021-10-03
 */
public enum ResultCode {
    /**
     * 返回码枚举
     */
    SUCCESS(0, "success");

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回码信息
     */
    private String msg;

    /**
     * 返回码枚举 构造函数
     * @param code 返回码
     * @param msg 返回码信息
     */
    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }
    public String getMsg() {
        return this.msg;
    }
}
