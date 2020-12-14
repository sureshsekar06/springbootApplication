package com.sample.app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserDataEntity {

    @Column(name = "user_name")
    private String userName;
    @Id
    @Column(name="user_id")
    private String userId;
    @Column(name = "user_role")
    private String userRole;
    @Column(name = "task_id")
    private String taskId;
    @Column(name = "user_task")
    private String userTask;
}
