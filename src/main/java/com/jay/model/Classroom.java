package com.jay.model;

import javax.persistence.*;

@Table(name = "classroom")
public class Classroom {
    @Id
    private Integer id;

    @Column(name = "class_id")
    private Integer classId;

    /**
     * 班级类型;0,差班；1,好班
     */
    @Column(name = "class_type")
    private String classType;

    /**
     * 班级名称
     */
    private String name;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return class_id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取班级类型;0,差班；1,好班
     *
     * @return class_type - 班级类型;0,差班；1,好班
     */
    public String getClassType() {
        return classType;
    }

    /**
     * 设置班级类型;0,差班；1,好班
     *
     * @param classType 班级类型;0,差班；1,好班
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * 获取班级名称
     *
     * @return name - 班级名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置班级名称
     *
     * @param name 班级名称
     */
    public void setName(String name) {
        this.name = name;
    }
}