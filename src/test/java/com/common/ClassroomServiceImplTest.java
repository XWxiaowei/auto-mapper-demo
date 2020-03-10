package com.common;

import com.jay.model.Classroom;
import com.jay.service.ClassroomService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xiang.wei
 * @date 2020/3/8 2:29 PM
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class ClassroomServiceImplTest {
    @Autowired
    private ClassroomService classroomService;
    @Before
    public void setUp() {
        Classroom classroom = new Classroom();
        classroom.setId(3);
        classroom.setClassId(3);
        classroom.setClassType("0");
        classroom.setName("优秀的三班");
        classroomService.saveClassroom(classroom);
    }
    @Test
    public void saveClassroom() throws Exception {
        Classroom classroom = new Classroom();
        classroom.setId(4);
        classroom.setClassId(4);
        classroom.setClassType("1");
        classroom.setName("优秀的四班");
        boolean b = classroomService.saveClassroom(classroom);
        Assert.assertTrue(b);
    }

    @Test
    public void getClassroomById() throws Exception {
        Classroom classroomById = classroomService.getClassroomById(3);
        Assert.assertEquals("优秀的三班", classroomById.getName());
    }

    @Test
    public void getClassroomByName() throws Exception {
        List<Classroom> classrooms = classroomService.getClassroomByName("优秀的三班");
        Assert.assertEquals("优秀的三班", classrooms.get(0).getName());
    }

    @Test
    public void getByExample() {
        List<Classroom> classByExample = classroomService.getClassByExample();
        System.out.println("*******查询到的数据条数有" + classByExample.size());
    }
}