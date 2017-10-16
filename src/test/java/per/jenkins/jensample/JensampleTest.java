package per.jenkins.jensample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JensampleTest {
     private Jensample jensample = new Jensample();

     @Test
     public void testSum() {
          assertEquals(5, jensample.sum(2, 3));
     }
}