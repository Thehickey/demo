package factory;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;

public class DruidDataSourceFactoryBean implements FactoryBean<DataSource> {

    @Override
    public DataSource getObject() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
