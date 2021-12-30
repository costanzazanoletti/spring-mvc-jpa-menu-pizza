package pizzeria.repository;

import org.springframework.data.repository.CrudRepository;

import pizzeria.model.Pizza;

public interface PizzaRepository extends CrudRepository<Pizza, Integer> {

}
