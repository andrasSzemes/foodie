package andras.szemes.foodie.service;

import andras.szemes.foodie.model.Food;
import andras.szemes.foodie.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Date;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAll() {
        List<Food> foodList = foodRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
        for (Food food : foodList) {
            formatDate(food);
        }
        return foodList;
    }

    private void formatDate(Food food) {
        Date date = food.getCookingDate();
        String repr = "Unknown date";
        try {
            repr = String.format("%d. %d. %d.", date.getYear()+1900, date.getMonth()+1, date.getDate());
        }
        catch (NullPointerException e) {
            //Logging could be added
        }
        finally {
            food.setCookingDateRepr(repr);
        }
    }
}
