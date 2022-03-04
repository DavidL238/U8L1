import java.util.ArrayList;
import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        /*
        Program will randomize seats & partners
        Accounts for the two missing seats on row 1
         */
        String[][] seats = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle", null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", null, "Rely" },
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justin Liu", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn" }
        };
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 12; p++) {
                if (seats[i][p] != null) {
                    list.add(seats[i][p]);
                }
            }
        };
        String[][] newSeats = new String[3][12];
        boolean allRandom = false;
        while (!allRandom) {
            String[] newSeatList = new String[36];
            for (int i = 0; i < 33; i++) {
                boolean reroll = true;
                while (reroll) {
                    int location = (int)(Math.random()*35);
                    if (newSeatList[location] == null && location != 10 && location != 11) {
                        reroll = false;
                        newSeatList[location] = list.get(i);
                    }
                }
            }
            for (int x = 0; x < newSeatList.length; x++) {
                newSeats[x/12][x-(12*(x/12))] = newSeatList[x];
            }
            boolean check = false;
            for (int i = 0; i < seats.length; i++) {
                for (int p = 0; p < 12; p++) {
                    if (seats[i][p] != null) {
                        if (p - 1 > 0) {
                            if (seats[i][p-1] != null) {
                                if (seats[i][p-1].equals(newSeats[i][p-1])) {
                                    check = true;
                                    break;
                                }
                            }
                        }
                        if (p + 1 < seats[i].length) {
                            if (seats[i][p+1] != null) {
                                if (seats[i][p+1].equals(newSeats[i][p+1])) {
                                    check = true;
                                    break;
                                }
                            }
                        }
                        if (seats[i][p].equals(newSeats[i][p])) {
                            check = true;
                            break;
                        }
                    }
                }
            }
            if (!check) {
                allRandom = true;
            }
        }
        for (String[] row : newSeats) {
            System.out.println(Arrays.toString(row));
        }
    }
}
