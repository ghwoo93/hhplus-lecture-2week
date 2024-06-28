package io.hhplus.clean.architect.lecture.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.hhplus.clean.architect.lecture.aggregate.entity.Lecture;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class LectureRepositoryImpl implements LectureRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Lecture> findAll() {
        return entityManager.createQuery("SELECT l FROM Lecture l", Lecture.class).getResultList();
    }
}
