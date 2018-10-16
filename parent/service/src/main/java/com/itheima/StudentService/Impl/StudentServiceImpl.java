package com.itheima.StudentService.Impl;

import cn.itheima.dao.StudentDao.StudentDao;
import com.itheima.Student;
import com.itheima.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAll() {
        List<Student> list = studentDao.findAll();
        return list;
    }
}
