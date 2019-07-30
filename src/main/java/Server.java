import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

public class Server {

    private static int port = 7777; // Port that server will listen for connections on

    public static void main(String[] args) throws Exception {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/html");
        }).start(port);

        app.routes(() -> {
            get("/displayRent", DisplayRent.displayAllRentals);
            get("/searchProperties", SearchProperties.searchForm);
            get("/addTenant", AddTenant.addTenantForm);
            post("/doAddTenant", AddTenant.addTenant);
            post("/doSearch", SearchProperties.doSearch);
        });

//        app.post("/doSearch", ctx -> {
//            DisplayRent.put(ctx.formParam("day"), ctx.formParam());
//            ctx.html("Your reservation has been saved");
//        });



    }

}