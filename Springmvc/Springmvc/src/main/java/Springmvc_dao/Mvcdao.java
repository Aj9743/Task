package Springmvc_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Springmvc_dto.Mvcdto;

public class Mvcdao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();

	public void insert(Mvcdto dto1) {
		t.begin();
		m1.persist(dto1);
		t.commit();

}
	public String delete(int id) {

		System.out.println("dao  " + id);

		Mvcdto e1 = m1.find(Mvcdto.class, id);

		if (e1 != null) {

			t.begin();

			m1.remove(e1);

		t.commit();



			return "data deleted";

		} else {

			return "no data found";

		}

	}
	
}
