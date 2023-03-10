package org.SRK;

import java.time.LocalDate;

import javax.persistence.*;

public class SaveData {

	public static void main(String[] args) 
	{
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		Person p=new Person();
		p.setName("balayya");
		p.setPlace("andhra");
		PanCard c=new PanCard();
		c.setDob(LocalDate.parse("1947-08-15"));
		c.setNumber("ABL457");
		c.setState("AP");
		p.setPan(c);
		m.persist(p);
		m.persist(c);
		t.begin();
		t.commit();
	}
}
