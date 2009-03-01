package can.haz

import org.junit._
import Assert._

import lolz._

class TestLolz {
  @Test
   def mustErrorOnONOES() {
     
     var error = false
     try {
       O NOES !!
     } catch {
       case t => error = true
     }
     assertTrue(error);
   }
}
