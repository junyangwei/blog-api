package blogapi.util;

import lombok.Data;

/**
 * 封装统一的返回体
 * @author junyangwei
 * @date 2021-10-03
 */
@Data
public class Result<T> {
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回码信息
     */
    private String msg;
    /**
     * 返回体
     */
    private T data;

    /**
     * 响应成功返回体
     * {"code":0,"msg":"ok","data":...}
     * @param data 响应成功返回体
     * @return result
     */
    public static Result success(Object data) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 设置返回码和返回信息
     * @param resultCode 返回码枚举
     */
    private void setResultCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }
}
