package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/mypage/myEstimateList")
	public String estimateList() {
		return "/mypage/myEstimateList";
	}

}
