package nithin.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import nithin.dto.dto;

public class dao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();
	public void insert(dto d)
	{
		t.begin();
		m1.persist(d);
		t.commit();
	}
	public String delete(int id) {
	dto d=m1.find(dto.class, id);
	if(d!=null)
	{
		t.begin();
		m1.remove(d);
		t.commit();
		return "data deleted";
	}
	else
	{
		return "no data found";
	}
		
	}
	public Object fetch(int id1) {
		dto d=m1.find(dto.class , id1);
		if(d!=null)
		{
		System.out.println(d.getId());
		System.out.println(d.getCity());
		System.out.println(d.getCountry());
		System.out.println(d.getEmail());
		System.out.println(d.getPassword());
		System.out.println(d.getPhno());
		System.out.println(d.getState());
		System.out.println(d.getZip());
		return "data fetched";
		}
		else
		{
			return "no data found";
		}
		
		
	}
}
