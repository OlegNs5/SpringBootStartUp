package ro.ctrln.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StarhawkTestDrivenDevelopment {

@Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk4_1(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(4);
        assertEquals("Starhawck 4",starhawk.getBattleshipName());
    }

    @Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk4_2(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(8);
        assertEquals("Starhawck 4",starhawk.getBattleshipName());
    }
    @Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk7_1(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(7);
        assertEquals("Starhawck 7",starhawk.getBattleshipName());
    }

    @Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk7_2(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(14);
        assertEquals("Starhawck 7",starhawk.getBattleshipName());
    }
    @Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk28_1(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(28);
        assertEquals("Starhawck 28",starhawk.getBattleshipName());
    }
    @Test
    public void starhawkGetBattleshipNameShouldReturnStarhawk209(){
        Starhawk starhawk = new Starhawk();
        starhawk.setNumberOfDecks(209);
        assertEquals("Starhawck 209",starhawk.getBattleshipName());
    }
}
