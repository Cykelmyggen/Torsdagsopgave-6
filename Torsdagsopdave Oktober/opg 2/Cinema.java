import java.util.Arrays;

public class Cinema {
    String[][] seats;

    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X";
        initializeSeats();
    }

    private void initializeSeats() {
        for (String[] seat : seats) {
            Arrays.fill(seat, "O");
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    public boolean reserve(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length && seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length && seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String[] seatRow : seats) {
            result.append("|");
            for (String s : seatRow) {
                result.append(s).append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
