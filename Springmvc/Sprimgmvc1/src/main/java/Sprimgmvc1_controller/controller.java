package Sprimgmvc1_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Sprimgmvc1_dao.Springdao;
import Sprimgmvc1_dto.Sprpingdto;


@Controller
public class controller {
	
	
	@Autowired
	Springdao dao;
	@RequestMapping("/insert")
	@ResponseBody
		void  insert(@ModelAttribute Sprpingdto d1)
		{
		System.out.println("inserted");
int id=d1.getId();
String name=d1.getName();
////System.out.println(id+" "+name);
////		System.out.println(d1.getId());

		
			dao.insert(d1);
			
		}

		
		@RequestMapping("/delete")
		@ResponseBody
	void delete(@ModelAttribute Sprpingdto d2)
	{
			int id=d2.getId();
	
		dao.delete(id);
		
		
	}
		@RequestMapping("/fetch")
		@ResponseBody
		 public ModelAndView fetch(@ModelAttribute Sprpingdto d2)
		{
			int id=d2.getId();
			
	
			String s=dao.fetch(id);
			System.out.println(s);
			ModelAndView modelAndView=new ModelAndView("Fetch.jsp");
			modelAndView.addObject("obj",s );
			return modelAndView;
			
		}
		@RequestMapping("/deleteall")
		@ResponseBody
		String deleteall(@ModelAttribute Sprpingdto sprpingdto)
		{
		
			String s=dao.deleteAll();
			return s;
		}
		
@RequestMapping("/fetchall")
@ResponseBody
  public ModelAndView fetchall(@ModelAttribute Sprpingdto dto)
{
	List<Sprpingdto> list=(List<Sprpingdto>)dao.fetchall();
	ModelAndView andView=new ModelAndView("fetchall.jsp");
	andView.addObject("obj", list);
	return andView;
}
}
