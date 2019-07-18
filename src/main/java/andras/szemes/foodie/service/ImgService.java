package andras.szemes.foodie.service;

import andras.szemes.foodie.model.ImgsEntity;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ImgService {
    public ImgsEntity getAll() {
        String[] imgNames = new File("./src/main/resources/static/img").list();

        ImgsEntity imgs = new ImgsEntity();
        imgs.setImgNames(imgNames);
        imgs.setAmount(imgNames.length);

        return imgs;
    }
}
