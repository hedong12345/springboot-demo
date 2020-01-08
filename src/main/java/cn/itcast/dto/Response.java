package cn.itcast.dto;

/**
 * @author 11730
 * @date 2020/1/8
 */
public class Response<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public Response(Integer code, String msg, T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public Response(ServiceStatus status, T data){
        this.code=status.getCode();
        this.msg=status.getMsg();
        this.data=data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
