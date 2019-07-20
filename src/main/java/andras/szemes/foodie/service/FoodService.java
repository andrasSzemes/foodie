package andras.szemes.foodie.service;

import andras.szemes.foodie.model.Food;
import andras.szemes.foodie.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAll() {
        return foodRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
    }
}
