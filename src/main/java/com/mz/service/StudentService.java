package com.mz.service;

import com.mz.pojo.XdStudents;

import java.util.List;

public interface StudentService {
    int addStudent (XdStudents student);

    XdStudents queryStudentById (String id);
    List<XdStudents> queryAllStudent();
    int resetPassword (String id);
    int deleteStudent (String id);
    int addPassword(XdStudents student);
}
