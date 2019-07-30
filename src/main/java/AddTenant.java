import io.javalin.http.Handler;

public class AddTenant {

    public static Handler addTenantForm = ctx -> {

        ctx.html(HTML.header + "Add a tenant form" + HTML.footer);

    };

    public static Handler addTenant = ctx -> {

        ctx.html(HTML.header + "Adding tenant..." + HTML.footer);

    };

}