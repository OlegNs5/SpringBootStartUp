package ro.ctrln.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BattleshipDTO {

    private Long id;
    private String battleshipName;
    private Integer battleshipCapacity;

}
