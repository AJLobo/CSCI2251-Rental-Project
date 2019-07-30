import io.javalin.http.Handler;

public class SearchProperties {

    public static Handler searchForm = ctx -> {

        ctx.html(HTML.header + "<h2>Make reservation:</h2>\n" +
                "<form method=\"post\" action=\"/doSearch\">\n" +
                "    Choose day\n" +
                "    <select name=\"day\">\n" +
                "        <option value=\"saturday\">Saturday</option>\n" +
                "        <option value=\"sunday\">Sunday</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    Choose time\n" +
                "    <select name=\"time\">\n" +
                "        <option value=\"8:00 PM\">8:00 PM</option>\n" +
                "        <option value=\"9:00 PM\">9:00 PM</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    <button>Submit</button>\n" +
                "</form>" + HTML.footer);

    };

    public static Handler doSearch = ctx -> {

        String day = ctx.formParam("day");

        ctx.html(day);

    };

}
