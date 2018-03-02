package net.hobbypedia.HobbyPediaBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.hobbypedia.HobbyPediaBackend.dao.CategoryDAO;
import net.hobbypedia.HobbyPediaBackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub

		String selectActiveCategory = "FROM Category WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			// add category into database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {

		category.setActive(false);

		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
