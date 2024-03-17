import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
*/
public class Main {
    public static void main (String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data.format(DateTimeFormatter.ofPattern("yyyy")));
        System.out.println(data.format(DateTimeFormatter.ofPattern("MMMM")));
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd")));
        System.out.println(data.format(DateTimeFormatter.ofPattern("EEEE")));
    }
}
