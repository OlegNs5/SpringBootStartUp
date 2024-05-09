package ro.ctrln.entities;

public class Starhawk {

    //define getBattleshipName() using this specs:
    //if number of decks divides by 4 return Starhawk 4
    //if number of decks divides by 7 return Starhawk 7
    //if number of decks divides by 28 return Starhawk 28
    //if number of decks divides doesn't divide by neither of them return Starhawk  'number of descks's

    private int numberOfDecks;

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public String getBattleshipName() {
        if (devideBy4() && devideBy7())  {
            return "Starhawck 28";
        }
        if (devideBy4()){
            return "Starhawck 4" ;
        }
        if (devideBy7()){
            return "Starhawck 7" ;
        }
        return "Starhawck " + numberOfDecks;
    }

    private boolean devideBy7() {
        return getNumberOfDecks() % 7 == 0;
    }

    private boolean devideBy4() {
        return getNumberOfDecks() % 4 == 0;
    }
                //Mai sus ↑ avem acelasi cod dar refactorizat datorita DrivenDevelopman(dtos)
//    public String getBattleshipName() {
//        if (getNumberOfDecks() % 4 == 0 && getNumberOfDecks() % 7 == 0)  {
//            return "Starhawck 28";
//        }
//        if (getNumberOfDecks() % 4 == 0){
//            return "Starhawck 4" ;
//        }
//        if (getNumberOfDecks() % 7 == 0){
//            return "Starhawck 7" ;
//        }
//        return "Starhawck " + numberOfDecks;
//    }
}
