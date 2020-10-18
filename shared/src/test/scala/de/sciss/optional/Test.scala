package de.sciss.optional

/** Test that this compiles. XXX TODO -- proper ScalaTest suite. */
trait Test {
  def takesOption[A](opt: Option[A]) = ()

  def takesOptional[A](opt: Optional[A]): A = opt.getOrElse(throw new NoSuchElementException)

  def patternMatch[A](opt: Optional[A]) = opt.self match {
    case Some(x) => "some"
    case None    => "none"
  }

  def withDefault(opt: Optional[String] = "default") = ()

  def invoke(): Unit = {
    takesOption(Some(123))
    takesOption(None)

    takesOptional(Some(123))
    takesOptional(123)
    takesOptional(None)
    withDefault()
    withDefault("hello")
  }
}
