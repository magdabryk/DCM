package pl.camp.it.distance.coaching.manager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class TrainingPlan {
    private int id;
    private String name;
    private int duration; //weeks
    private double price;
    private Coach coach;

}
