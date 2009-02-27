package can.haz
  
object lolz {

  //BETTER SWITCHING (Safer!!!!ONE!!!!!)
  private[lolz] class WTF[A,B](val something : A, val partialFunction : PartialFunction[A,B]) {
        
    def OMG(f : PartialFunction[A,B]) = new WTF(something, partialFunction orElse f);
    def ?!!? = this
    
    def asResult = partialFunction.apply(something)
  }   
  implicit def omg[A](something : A) = new  {
    def WTF[B] = new WTF[A,B](something, { case null => O NOES !! })
    //funnier equals
    def IZ[B](tehOther :B) = something == tehOther
    //The questioning operator, ensures memory around this instruction is sane
    def ? = { assert(true); something }
    //emphatic operator
    def !!!!!!!!! = if(something != null) something else O NOES !!    
   
  }
  implicit def OMG[A,B](something : WTF[A,B]) = something.asResult
  //Better true-false support, usable in type-meta-programming (sometime in the future of scala)
  object WIN
  object FAIL
  implicit def epicWin(win : WIN.type) = true
  implicit def epicFail(fail : FAIL.type) = false
  
  
  //BETTER SANITY
  object Can {
    def has(assertion : => Boolean) = new {
      assert(assertion)
    }
    def has[A](something : A) = new {
      assert(something != null)
      def ? = ()
    }
  }
  //BETTER FAILS  
  object !! {}
  object O {    
    def NOES(x : !!.type) = error("DO NOT WANT!")
  }
}