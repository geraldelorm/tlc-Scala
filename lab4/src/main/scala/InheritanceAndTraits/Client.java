package InheritanceAndTraits;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private int points = 0;
    private MembershipType membershipType;
    private List<Trade> trades = new ArrayList<>();

    public Client(String firstName, String lastName, int points, MembershipType membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.membershipType = membershipType;
    }

    public void initializeMembership() {
        if (points > 0 && points < 10){
            membershipType = new Bronze();
        }else if (points > 10 && points < 19){
            membershipType = new Silver();
        }else if(points >= 20) {
            membershipType = new Gold();
        }
    }

    public void addTrade(Trade trade){
        trades.add(trade);
    }

    public boolean canTrade(){
//        int time = LocalTime.now().getHour();
//        if(){}
//
//        if (membershipType instanceof Bronze &&  points <= ((MembershipType.Bronze) membershipType).getLimit() && time >= 10){
//            return true;
//        }else if(membershipType instanceof Silver && points <= ((Silver) membershipType).getLimit()){
//            return true;
//        }else if(membershipType instanceof Gold && points <= ((MembershipType.Gold) membershipType).getLimit()){
//            return true;
//        }else {
//            return false;
//        }
        return true;
    }
}