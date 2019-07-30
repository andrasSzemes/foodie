package andras.szemes.foodie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Food {

    @Id
    @GeneratedValue
    private int id;

    @Column(length=4000)
    private String note;
    private Date cookingDate;
    @Transient
    private String cookingDateRepr;
    private String imgName;

}
