package net.hobbypedia.HobbyPediaBackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.hobbypedia.HobbyPediaBackend.dao.CategoryDAO;
import net.hobbypedia.HobbyPediaBackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.hobbypedia.HobbyPediaBackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("cooking"); category.setDescription("cooking desc");
	 * 
	 * assertEquals("Successfully added a category inside table!",true,categoryDAO.
	 * add(category));
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully fetched a single category from  table!",
	 * "cooking", category.getName());
	 * 
	 * }
	 */

	/*@Test
	public void testUpdateCategory() {

		category = categoryDAO.get(1);

		category.setName("cook");

		assertEquals("Successfully updated a single category in the table!", true, categoryDAO.update(category));

	}*/
	
	
	/*@Test
	public void testDeleteCategory() {
		
		category = categoryDAO.get(1);		
		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
		
	}*/
	
	/*@Test
	public void testListCategory() {
					
		assertEquals("Successfully fetched the list of categories from the table!",1,categoryDAO.list().size());
		
		
	}*/
}
