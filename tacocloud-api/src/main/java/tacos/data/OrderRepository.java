package tacos.data;

import tacos.Ingredient;
import tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {

}
