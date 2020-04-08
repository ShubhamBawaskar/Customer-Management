package cust.cm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cust.cm.pojo.CompanyPojo;
import cust.cm.service.CompanyService;

@Controller
public class welcomecontroller 
{
	@Autowired
	private CompanyService companyService;

	@GetMapping("/")
	String welcomePage(HttpServletRequest req, HttpServletResponse res)
	{
		return "welcome";
	}
	    
		 @GetMapping("/showCustomerForm")
		    String showCustomerForm(ModelMap model) 
		 {
		        model.addAttribute("companyPojo", new  CompanyPojo());
		        return "customerForm";
		 }

		 @PostMapping(value = "/registerCustomer")
		    public String registerCustomer(@Valid @ModelAttribute("companyPojo") CompanyPojo c,BindingResult br) 
		 {
		        System.out.println(c.getCname());
		      //  System.out.println(c.getEmail());

				if (br.hasErrors()) {
					return "customerForm";
				}
		        
		        companyService.save(c);
		        return "redirect:listCustomer";
		 }

			@GetMapping(value = "/listCustomer")
			public String listCustomer(ModelMap model)
		       {

				List<CompanyPojo> companyPojoList = companyService.list();
				model.addAttribute("companyPojoListObj", companyPojoList);
				model.addAttribute("companyPojo", new CompanyPojo());
				return "showCompanyList";
			  }

			@GetMapping(value = "/showEditForm")
			public String editCustomer(@RequestParam int id, ModelMap model) 
			{

				System.out.println("Value passed com id ..." + id);
				CompanyPojo companyPojo = companyService.get(id);
				model.addAttribute("companyPojo", companyPojo);

				return "editCompanyDetail";
			}

			@PostMapping(value = "/editCompanyDetails")
			public String editCustomer(@Valid @ModelAttribute("companyPojo") CompanyPojo c, BindingResult br, ModelMap model) 
			{
				if (br.hasErrors()) {
					model.addAttribute("companyPojo", c);
					return "editCompanyDetails";
				}
				companyService.update(c);

				return "redirect:listCustomer";
			}

			@GetMapping(value = "/deleteCompany")
			public String deleteCustomer(@RequestParam int id) 
			{

				companyService.deleteCompany(id);

				return "redirect:listCustomer";
			}

			// searchBYCompanyName
			@PostMapping(value = "/searchBYCompanyName")
			public String searchBYCompanyName(@Valid @ModelAttribute("companyPojo") CompanyPojo c, BindingResult br,
					ModelMap model) {


				List<CompanyPojo> companyPojoList = companyService.findByCompName(c.getCname().trim());

				model.addAttribute("companyPojoListObj", companyPojoList);

				return "showCompanyList";
			}
}
