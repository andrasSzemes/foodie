package andras.szemes.foodie.repository;

import andras.szemes.foodie.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
