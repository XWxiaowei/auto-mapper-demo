package com.jay.service;

import com.jay.model.Classroom;

import java.util.List;

/**
 * @author xiang.wei
 * @date 2020/3/8 2:16 PM
 */
public interface ClassroomService {
    
    /**
     * 保存班级
     * @param classroom
     * @return 
     * @author xiagwei
     * @date 2020/3/8 2:18 PM
     */ 
    boolean saveClassroom(Classroom classroom);
    
    /**
     * 根据主键id查询班级
     * @param id
     * @return 
     * @author xiagwei
     * @date 2020/3/8 2:21 PM
     */ 
    Classroom getClassroomById(int id);

    
    /**
     * 根据班级名称查询班级
     * @param name
     * @return 
     * @author xiagwei
     * @date 2020/3/8 2:22 PM
     */ 
    List<Classroom> getClassroomByName(String name);

    List<Classroom> getClassByExample();
    
}
