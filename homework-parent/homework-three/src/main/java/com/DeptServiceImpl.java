package com;

public class DeptServiceImpl implements DeptService{
    private DeptDao dao;

    public void setDao(DeptDao dao) {
        this.dao = dao;
    }

    @Override
    public Dept getById() {
        return dao.getById();
    }
}
