package com.jay.service;

import com.jay.mapper.ClassroomMapper;
import com.jay.model.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author xiang.wei
 * @date 2020/3/8 2:16 PM
 */
@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomMapper classroomMapper;


    @Override
    public boolean saveClassroom(Classroom classroom) {
        int result = classroomMapper.insert(classroom);
        return result == 1 ? true : false;
    }

    @Override
    public Classroom getClassroomById(int id) {
        Classroom classroom = classroomMapper.selectByPrimaryKey(id);
        return classroom;
    }

    @Override
    public List<Classroom> getClassroomByName(String name) {
        Classroom param = new Classroom();
        param.setName(name);
        List<Classroom> classrooms = classroomMapper.select(param);
        return classrooms;
    }

    @Override
    public List<Classroom> getClassByExample() {
        Example classRoomExample = new Example(Classroom.class);
        Example.Criteria criteria = classRoomExample.createCriteria();
        criteria.andLike("name", "%班%");
        criteria.andEqualTo("classType", "0");
        List<Classroom> classrooms = classroomMapper.selectByExample(classRoomExample);
        return classrooms;
    }
}
