package co.gc.famouslab;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FamousLabController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("redirect:/complete");
		return mav;
	}

	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mav = new ModelAndView("complete");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();
				
				// Set url
				String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

				ResponseEntity<Lists> response = restTemplate.exchange(
						"https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET,
						new HttpEntity<>(null), Lists.class);

				// Extract body from response
				Lists result = response.getBody();
				List<Complete> complete = result.getComplete();
				/*Collections.sort(complete, new Comparator<Complete>() {

					public int compare(Complete c1, Complete c2) {
						// TODO Auto-generated method stub
						return Integer.compare(c1.getYear(), c2.getYear());
					}
				});*/

				mav.addObject("complete", result.getComplete());

				
		return mav;
	}
	@RequestMapping("/tiny")
	public ModelAndView tiny() {

		ModelAndView mav = new ModelAndView("tiny");

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Lists> response = restTemplate.exchange(
				"https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET,
				new HttpEntity<>(null), Lists.class);

		Lists result = response.getBody();

		List<Tiny> tinyresult = result.getTiny();
		Collections.sort(tinyresult, new Comparator<Tiny>() {

			@Override
			public int compare(Tiny t1, Tiny t2) {
				// TODO Auto-generated method stub
				return Integer.compare(t1.getYear(), t2.getYear());
			}
		});

		mav.addObject("tiny", result.getTiny());

		return mav;
	}

}
