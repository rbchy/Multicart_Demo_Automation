package jettyserver;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleJettyServer {
	
	private final Server server;
    public static final int PORT = 8886;

	/** Default Constructors */
	public SampleJettyServer(int port) {

		server = new Server(port);

		// ServletContextHandler context = new
		// ServletContextHandler(ServletContextHandler.SESSIONS);
		// context.setContextPath("/");

		ResourceHandler resource_handler = new ResourceHandler();
		resource_handler.setDirectoriesListed(true);
		resource_handler.setWelcomeFiles(new String[] { "index.html" });

		resource_handler.setResourceBase(".");

		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
		server.setHandler(handlers);

		// server.setHandler(context);
		server.setHandler(resource_handler);

		// context.addServlet(new ServletHolder(new WithdrawalServlet(cashSlot,
		// account)),"/withdraw");
		// context.addServlet(new ServletHolder(new AtmServlet()),"/");
	}

	/** Start The Server */
	public void start() throws Exception {
		server.start();
		System.out.println("Listening on " + server.getURI());
	}

	/** Stop The Server */
	public void stop() throws Exception {
		server.stop();
		System.out.println("\nServer shutdown");
	}

	/** Main Method to Test The Server */
	public static void main(String[] args) throws Exception {
		// new AtmServer(9988, new CashSlot(), new Account()).start();
		new SampleJettyServer(PORT).start();
		WebDriverManager.chromedriver().setup();

		//EventFiringWebDriver webDriver = new EventFiringWebDriver(new ChromeDriver());
		//webDriver.get("http://localhost:" + PORT);
	}
}