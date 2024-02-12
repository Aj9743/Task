package Springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Springmvc_dao.Mvcdao;
import Springmvc_dto.Mvcdto;

@Controller
public class controller {
	@RequestMapping("/insert")
@ResponseBody
	void  insert(@ModelAttribute Mvcdto d1)
	{

		Mvcdao dao=new Mvcdao();
		dao.insert(d1);
		
	}

	
	@RequestMapping("/delete")
	@ResponseBody
void delete(@ModelAttribute Mvcdto d2)
{
		int id=d2.getId();
	Mvcdao dao=new Mvcdao();
	dao.delete(id);
	
	
}
}
	


