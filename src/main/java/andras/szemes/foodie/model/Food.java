package andras.szemes.foodie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private String imgName;

}
