import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;


public final class AgentLogger {

  public static LoggerContext context = new LoggerContext();

  static {
    Logger root = context.getLogger(Logger.ROOT_LOGGER_NAME);
    root.setLevel(Level.TRACE);
  }

  private Logger wl = null;

  private AgentLogger(String name) {
    wl = context.getLogger(name);
    wl.setAdditive(false);
  }


}
