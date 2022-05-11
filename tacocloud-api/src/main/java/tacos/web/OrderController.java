package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import tacos.Order;
import tacos.Taco;
import tacos.data.OrderRepository;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
	private final OrderRepository orderRepo;
	@Autowired
	public OrderController(OrderRepository orderRepo) {

	this.orderRepo = orderRepo;

	}
	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		log.info("Order submitted: ");
		return "orderForm";
	}
	@PostMapping
	public String processOrder(Order order) {
		orderRepo.save(order);
		return "redirect:/";
	}
}