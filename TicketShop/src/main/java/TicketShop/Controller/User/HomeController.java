package TicketShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import TicketShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl homeService;
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("hotproducts", homeService.GetDataHotProducts());
		return mv;
	}
	
	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
	@RequestMapping(value = {"/hot", "/up-comming"})
	public ModelAndView HotProduct() {
		ModelAndView mv = new ModelAndView("user/hotproduct");
		return mv;
	}
	@RequestMapping(value = "/ticket-details")
	public ModelAndView TicketDetails() {
		ModelAndView mv = new ModelAndView("user/ticketdetails");
		return mv;
	}
}
