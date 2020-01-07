package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    @Column(name="userName")
    private String userName;

    private String password;

    private String name;

    private Integer age;

    private String sex;

    private String birthday;

    private String created;

    private String updated;
    /**
     * 不需要持久化的字段
     */
    @Transient
    private String note;
}
