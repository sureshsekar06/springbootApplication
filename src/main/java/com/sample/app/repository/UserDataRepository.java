package com.sample.app.repository;

import com.sample.app.entity.UserDataEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public class UserDataRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createUserData(UserDataEntity userData) {
        entityManager.createNativeQuery("INSERT INTO public.userdata (user_name, user_id, user_role, task_id, user_task) VALUES (?1, ?2, ?3, ?4, ?5)").setParameter(1, userData.getUserName()).setParameter(2, userData.getUserId()).setParameter(3, userData.getUserRole()).setParameter(4, UUID.randomUUID()).setParameter(5, userData.getUserTask()).executeUpdate();
    }
}
