package com.mz.service;

import com.mz.dao.StudentMapper;
import com.mz.pojo.XdStudents;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(XdStudents student) {
        return studentMapper.addStudent(student);
    }


    public XdStudents queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }

    public List<XdStudents> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    public int resetPassword(String id) {
        return studentMapper.resetPassword(id);
    }

    public int deleteStudent(String id) {
        return studentMapper.deleteStudent(id);
    }

    public int addPassword(XdStudents student) {
        return studentMapper.addPassword(student);
    }
}
