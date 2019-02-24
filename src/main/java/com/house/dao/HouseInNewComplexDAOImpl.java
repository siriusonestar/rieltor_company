package com.house.dao;

import com.house.entities.HouseInNewComplex;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HouseInNewComplexDAOImpl implements HouseInNewComplexDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }

    public void addHouse(HouseInNewComplex houseInNewComplex) {
        Session session = sessionFactory.getCurrentSession();
        session.save(houseInNewComplex);
    }

    public void deleteHouseByID(HouseInNewComplex houseInNewComplex) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(houseInNewComplex);
    }

    public HouseInNewComplex updateHouseByID(int idHouse) {
        return null;
    }

    public List<HouseInNewComplex> listOfHouseInNewComplex() {
        Session session = sessionFactory.getCurrentSession();
        List<HouseInNewComplex> list = session.createQuery("from HouseInNewComplex").list();
        return list;
    }
}
