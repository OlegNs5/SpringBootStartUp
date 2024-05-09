package ro.ctrln.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ro.ctrln.entities.dtos.BattleshipDTO;
import ro.ctrln.repositories.BattleshipRepository;
import ro.ctrln.services.BattleshipService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BattleshipTests {

    @InjectMocks
    private BattleshipService battleshipService;
    @Mock
    private BattleshipRepository battleshipRepository;

    @Test
    public void testToStringShouldReturnBattleship(){
        Battleship battleship = new Battleship();
        battleship.setBattleshipName("BattleshipOne");
        battleship.setBattleshipCapacity(1000);
        assertEquals("Battleship(id=0, battleshipName=BattleshipOne, battleshipCapacity=1000)",battleship.toString());

    }
    @Test
    public void testBattleshipId1(){
            Battleship battleship = new Battleship();
            battleship.setBattleshipName("BattleshipOne");
            battleship.setBattleshipCapacity(1000);
            battleship.setId(1L);
            when(battleshipRepository.findById(1L)).thenReturn(Optional.of(battleship));
            BattleshipDTO battleshipDTO = BattleshipDTO
                  .builder()
                .battleshipCapacity(1000)
                .battleshipName("BattleshipOne")
                .id(1L)
                .build();
        assertEquals(battleshipDTO, battleshipService.getlBattleship(1L));
    }
    @Test
    public void testBattleshipNull(){
        when(battleshipRepository.findById(1L)).thenReturn(Optional.empty());
        BattleshipDTO battleshipDTO = BattleshipDTO
                .builder()
                .battleshipCapacity(0)
                .battleshipName("BattleshipNotFound")
                .id(0L)
                .build();
        assertEquals(battleshipDTO, battleshipService.getlBattleship(1L));

    }
    @Test
    public void repositoryBahaviorTest(){
        when(battleshipRepository.findById(10L)).thenReturn(Optional.empty());

        battleshipRepository.findById(10L);
        battleshipRepository.findAll(); //aceste trei pot fi oriunde in cod
        battleshipRepository.findAll();
        battleshipRepository.findAll();
                //Este foarte recomandat ca fie un singur "verify()" intr-un singur @Test (testare)
        verify(battleshipRepository).findById(ArgumentMatchers.eq(10L));
        verify(battleshipRepository,times(3)).findAll();

        verify(battleshipRepository,never()).count();
        verify(battleshipRepository,atLeast(1)).findAll();
//        verify(battleshipRepository,times(0)).count();
//        verifyNoInteractions(battleshipRepository);//asta nu trece ca avem deja intaractiuni
    }
}
