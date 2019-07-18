package andras.szemes.foodie.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImgsEntity {
    private int amount;
    private String[] imgNames;
}
