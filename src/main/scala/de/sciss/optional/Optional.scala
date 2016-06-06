/*
 * Optional.scala
 * (Optional)
 *
 * Copyright (c) 2016 Hanns Holger Rutz. All rights reserved.
 *
 * This software is published under the GNU Lesser General Public License v2.1+
 *
 *
 * For further information, please contact Hanns Holger Rutz at
 * contact@sciss.de
 */

package de.sciss.optional

import scala.language.implicitConversions

object Optional {
  implicit def some[@specialized A](a: A): Optional[A] = new Optional(Some(a))
  implicit def apply  [A](a: Option  [A]): Optional[A] = new Optional(a)
  implicit def unapply[A](a: Optional[A]): Option  [A] = a.self
}
final class Optional[+A](val self: Option[A]) extends AnyVal with Proxy