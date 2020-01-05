package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name="tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String userName;
    private String password;
    private String name;
    private String age;
    private String sex;
    @Transient
    private String note;
}
