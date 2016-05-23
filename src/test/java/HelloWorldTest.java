import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {
  @Test
  public void testNoArgs() {
    HelloWorld hw = new HelloWorld();
    assertEquals("Hello world!", hw.getMessage());
  }

  @Test
  public void testArg() {
    HelloWorld hw = new HelloWorld();
    assertEquals("Hello, everyone!", hw.getMessage("everyone"));
  }
}
