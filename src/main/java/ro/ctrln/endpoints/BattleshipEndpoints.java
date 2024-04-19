package ro.ctrln.endpoints;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import ro.ctrln.entities.dtos.BattleshipDTO;
import ro.ctrln.services.BattleshipService;

import java.util.List;

@RestController
public class BattleshipEndpoints {

    @Autowired
    private BattleshipService battleshipService;

    @GetMapping("/battleship")
    public List<BattleshipDTO> getBattleships(){
        return battleshipService.getAllBattleships();
    }

    @GetMapping("/battleship/{battleshipId}")
    public BattleshipDTO getBattleship(@PathVariable Long battleshipId){
        return battleshipService.getlBattleship(battleshipId);
    }

    @DeleteMapping("/battleship/{battleshipId}")
    public void deleteBattleship(@PathVariable Long battleshipId){
        battleshipService.deleteBattleship(battleshipId);
    }

    @PostMapping("/battleship")
    public void createBattleship(@RequestBody BattleshipDTO battleshipDTO){
        battleshipService.createBattleship(battleshipDTO);
    }
    @PutMapping("/battleship")
    public void updateBattleship(@RequestBody BattleshipDTO battleshipDTO){
        battleshipService.updateBattleship(battleshipDTO);
    }
}
