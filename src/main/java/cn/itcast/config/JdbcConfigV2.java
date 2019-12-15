package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * java配置的方式代替xml配置
 */
@Configuration
//@PropertySource("classpath:application.properties")
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfigV2 {

//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.userName}")
//    private String userName;
//
//    @Value("${jdbc.password}")
//    private String password;

//    @Autowired
//    private JdbcProperties jdbcProperties;
//
//    public JdbcConfigV2(JdbcProperties jdbcProperties) {
//    }

    @Bean
    public DataSource dateSource(JdbcProperties prop) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUserName());
        dataSource.setPassword(prop.getPassword());

        return dataSource;
    }
}
