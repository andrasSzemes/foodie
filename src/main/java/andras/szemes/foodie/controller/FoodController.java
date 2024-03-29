package andras.szemes.foodie.controller;

import andras.szemes.foodie.model.Food;
import andras.szemes.foodie.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getAllFoods() {
        try { return foodService.getAll(); }
        catch (NullPointerException e) {
            return new ArrayList<>();
        }
    }
}
