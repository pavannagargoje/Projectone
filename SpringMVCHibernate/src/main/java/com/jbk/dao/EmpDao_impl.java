package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;




@Repository
public class EmpDao_impl implements EmpDao_i {

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Employee> logincheck(String username, String password) {
		
//		String hqlString = " from Customer where userName= :u and password= :p";
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hqlString);
//		query.setParameter("u", customer.getUserName());                                    one way
//		query.setParameter("p", customer.getPassword());
//		List<Customer> list=query.getResultList();
//		Customer customer2=list.get(0);
//
//		 // Customer theCustomer = currentSession.get(Customer.class, cu);
//	        return customer2;

		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		List<Employee> elist=new ArrayList<Employee>();                          //      second way
		
		Criterion c1= Restrictions.eq("username", username);
		Criterion c2=Restrictions.eq("password", password);
		criteria.add(Restrictions.and(c1,c2));
		
		elist=criteria.list();
//		Employee emp=elist.get(0);
		
		
		return elist;
		
	}



	@Override
	public List<Employee> getallemp() {
		
//		 Session session = sessionFactory.getCurrentSession();
//	        CriteriaBuilder cb = session.getCriteriaBuilder();
//	        CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
//	        Root < Customer > root = cq.from(Customer.class);
//	        cq.select(root);
//	        Query query = session.createQuery(cq);
//	        return query.getResultList();

		
		Session session;
		List<Employee> list = null;
		try {
			session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Employee.class);
			list = criteria.list();

		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return list;
	}



	@Override
	public Employee getempbyid(int id) {
	
		Session session=sessionFactory.getCurrentSession();
		Employee employee=session.get(Employee.class, id);
		return employee;
	}



	@Override
	public void saveorupdate(Employee employee) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);
		
	}



	@Override
	public void deleteemp(int id) {
		Session session=sessionFactory.getCurrentSession();
		Employee employee=session.get(Employee.class, id);
		session.delete(employee);
		
	}

}
