import io.javalin.Javalin;

public class Index {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/html");
        }).start(7777);

        app.get("/searchProperties/*", ctx -> {

            String agent = ctx.userAgent();
            app.

        });


        app.stop();

    }

}
