package com;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import java.sql.SQLException;

public class DeptDaoImpl implements DeptDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Dept getById() {
        String sql = "select id,deptname from dept where id = 6";
        BeanHandler<Dept> handler = new BeanHandler(Dept.class);
        try {
            return queryRunner.query(sql,handler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
