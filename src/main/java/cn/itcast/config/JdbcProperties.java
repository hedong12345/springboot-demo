package cn.itcast.config;

import lombok.Getter;
import lombok.Setter;

/**
 * 配置文件
 */
//@ConfigurationProperties(prefix = "jdbc")
@Setter
@Getter
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String userName;
    private String password;

}
