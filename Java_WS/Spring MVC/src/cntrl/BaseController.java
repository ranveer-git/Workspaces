package cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import bean.Result;

@Controller
public class BaseController 
{

	@RequestMapping("/")
	public String serveBasicRequest(ModelMap mm)
	{
		mm.addAttribute("name", "World");
		return "index";
	}
	
	@RequestMapping("/getCountries")
	public String fetchCountries(ModelMap mm)
	{
		RestTemplate rt = new RestTemplate();
		
//		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//		messageConverters.add(new FormHttpMessageConverter());
//		messageConverters.add(new StringHttpMessageConverter());
//		messageConverters.add(new MappingJackson2HttpMessageConverter());
//		rt.setMessageConverters(messageConverters);
		
		String url = "http://services.groupkt.com/country/get/all";
		String res = rt.getForObject(url, String.class);
		
//		Quote quote = rt.getForObject("http://services.groupkt.com/country/get/all", Quote.class);
//        System.out.println(quote.toString());
		System.out.println(res);
		
		return "listOfCountries";
		
	}
}
