package Sprimgmvc1_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

//import com.mysql.cj.Query;

import Sprimgmvc1_dto.Sprpingdto;

//import Springmvc_dto.Mvcdto;
@Component
public class Springdao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();

	public void insert(Sprpingdto dto1) {

		t.begin();

		m1.persist(dto1);

		t.commit();
	
}
	public String delete(int id) {

		System.out.println("dao  " + id);

		Sprpingdto e1 = m1.find(Sprpingdto.class, id);

		if (e1 != null) {

			t.begin();

			m1.remove(e1);

		t.commit();



			return "data deleted";

		} else {

			return "no data found";

		}

	}
	public String fetch( int id)
	{
		
		Sprpingdto e1 = m1.find(Sprpingdto.class, id);
		if(e1!=null) {
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			return "data found";
			
		}
		else
		{
			return  "no data found";
		}

	}
	public  String deleteAll()
	
	{
		javax.persistence.Query q=m1.createQuery("select a from Sprpingdto a");
		List<Sprpingdto> l=q.getResultList();
		if(l.isEmpty())
		{
			return "no data found";
		}
		else
		{
			for(Sprpingdto a:l)
			{
				t.begin();
				m1.remove(a);
				t.commit();
			}
			return "data deleted";
		}
	}
	public List<Sprpingdto> fetchall()
	{
		Query q=m1.createQuery("select data from Sprpingdto data");
		 List<Sprpingdto> w=q.getResultList();
		 return w;
	
	}

}
