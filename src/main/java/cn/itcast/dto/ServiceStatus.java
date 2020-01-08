package cn.itcast.dto;

/**
 * @author 11730
 * @date 2020/1/8
 */
public enum ServiceStatus {

    SUCCESS(200,"success"),
    FAIL(400,"fail");

    private Integer code;
    private String msg;
    private ServiceStatus(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
