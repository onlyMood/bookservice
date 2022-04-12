package com.mz.dao;

import com.mz.pojo.XdStudents;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int addStudent (XdStudents student);
    int addPassword(XdStudents student);
    XdStudents queryStudentById (@Param("id") String studentid);
    List<XdStudents> queryAllStudent();
    int resetPassword (String id);
    int deleteStudent (String id);
}
