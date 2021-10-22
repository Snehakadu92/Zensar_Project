package com.zensar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zensar.dao.CourseDao;
import com.zensar.model.Course;



@Controller
public class CourseController {
	
	@Autowired
	private CourseDao coursedao;
	
	@GetMapping("/")
	public String getAll(Model model)
	{
		List<Course> list= coursedao.findAll();
		model.addAttribute("courselist",list);
		return "index";
	}
	
	@PostMapping(value="/save")
	public String save(@ModelAttribute("course") Course c)
	{	
		coursedao.save(c);
		return "redirect:/";

	}
	
	
	@GetMapping(value="/add")
	public String AddCourse()
	{	return "addCourse";
	}
	
	@GetMapping(value="/edit/{cid}")
	public String edit(@PathVariable("cid") int cid, Model model)
	{

		Course p=coursedao.findById(cid).orElse(null);
		model.addAttribute("Course",p);
		return "updateCourse";
	}
	
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute("s") Course c) {
		
		coursedao.save(c);
		return "redirect:/";

	}
	

	
	@GetMapping(value="/delete/{cid}")
	public String edit(@PathVariable("cid") int cid)
	{
		coursedao.deleteById(cid);
		return "redirect:/";
	}

	
	
}
