import io.javalin.http.Handler;

public class DisplayRent {

    public static Handler displayAllRentals = ctx -> {

        ctx.html(HTML.header + "Display all rentals" + HTML.footer);

    };

}
