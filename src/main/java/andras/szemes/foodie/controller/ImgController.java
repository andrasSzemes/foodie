package andras.szemes.foodie.controller;

import andras.szemes.foodie.model.ImgsEntity;
import andras.szemes.foodie.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imgs")
public class ImgController {

    @Autowired
    private ImgService imgService;

    @GetMapping
    public ImgsEntity getAllImgs() {
        return imgService.getAll();
    }
}
