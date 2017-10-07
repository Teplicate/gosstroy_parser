package dao;

import entity.BuildingData;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BuildingDAO {


    EntityManager entityManager = Persistence
            .createEntityManagerFactory("pers_unit")
            .createEntityManager();

    public Long add(BuildingData buildingData)
    {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(buildingData);
        tx.commit();
        return buildingData.getId();
    }

    public BuildingData get(Long id)
    {
        return entityManager.find(BuildingData.class, id);
    }





}
