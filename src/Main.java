import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.vwcc.itp220mod4.Ticket;
import edu.vwcc.itp220mod4.TicketCsvReader;
import edu.vwcc.itp220mod4.TicketQueries;
import edu.vwcc.itp220mod4.TicketReportWriter;
import edu.vwcc.itp220mod4.TicketStats;

/** Connects the four completed exercises into one small help desk program. */
public class Main {

    public static void main(String[] args) throws IOException {
        Path input = Path.of("data", "tickets.csv");
        Path output = Path.of("output", "category-summary.txt");

        List<Ticket> tickets = TicketCsvReader.read(input);
        List<Ticket> openTickets = TicketQueries.openTickets(tickets);
        Set<String> technicians = TicketQueries.technicianNames(tickets);
        Map<String, Integer> categoryCounts = TicketStats.countByCategory(tickets);

        Files.createDirectories(output.getParent());
        TicketReportWriter.writeCategorySummary(output, categoryCounts);

        System.out.println("Tickets loaded: " + tickets.size());
        System.out.println("Open tickets: " + openTickets.size());
        System.out.println("Assigned technicians: " + technicians.size());
        System.out.println("Summary written to: " + output);
    }
}
