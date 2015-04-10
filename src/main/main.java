package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import persistence.JPAUtil;
import models.schools;

public class main {

	public static void main(String[] args) {
		schools sc=new schools("test","test","test","test","14");
		 EntityManager em = JPAUtil.createEntityManager();
	        EntityTransaction tx = em.getTransaction();
	        tx.begin();	
	        em.persist(sc);
	        tx.commit();
	        em.close();
	}

}
