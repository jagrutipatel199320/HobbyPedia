package net.hobbypedia.hobbypedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.hobbypedia.HobbyPediaBackend.dao.CategoryDAO;
import net.hobbypedia.HobbyPediaBackend.dto.Category;

@Controller
@Component
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value = "/about" )
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact" )
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/** Methods to load all events based on category**/
	
	@RequestMapping(value = "/show/all/events")
	public ModelAndView showAllEvents() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Events");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllEvents", true);
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/events")
	public ModelAndView showCategoryEvents(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		//passing single category object
		mv.addObject("category",category);		
		
		mv.addObject("userClickCategryEvents", true);
		return mv;
		
			
	}

}
