public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.bookTicket("A12", 300);
        ticket1.displayTicket();
    }
}