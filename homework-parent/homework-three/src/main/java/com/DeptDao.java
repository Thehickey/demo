package com;

import org.apache.ibatis.annotations.Select;

public interface DeptDao {

    @Select("select id,deptname from dept where id = 8")
    Dept getById();

}
