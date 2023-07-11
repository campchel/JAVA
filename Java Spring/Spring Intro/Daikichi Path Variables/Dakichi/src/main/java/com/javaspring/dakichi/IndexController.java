package com.javaspring.dakichi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/daikichi")
public class IndexController {
        @RequestMapping("")
        public String daikichi() {
                return "Welcome!";
        }
        @RequestMapping("/today")
        public String today() {
                return "Today you will find luck in all your endeavors!";
        }
        
        @RequestMapping("/tomorrow")
        public String tomorrow() {
        	return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
        
        
        @RequestMapping("/travel/{city}")
        public String travelToCity(@PathVariable String city) {
        	return "Congratulations! You will soon travel to " + city + "!";
        }

        
        
        @RequestMapping("/lotto/{number}")
        public String checkLottoNumber(@PathVariable int number) {
        	if (number % 2 == 0) {
        		return "You will take a grand journey in the near future, but be a weary of temping offers.";
        	} else {
        		return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
        	}
        }

}
