package tacos.data;

import tacos.Ingredient;
import tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, String> {

}
