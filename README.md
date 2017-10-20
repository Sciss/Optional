# Optional

[![Build Status](https://travis-ci.org/Sciss/Optional.svg?branch=master)](https://travis-ci.org/Sciss/Optional)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.sciss/optional_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.sciss/optional_2.11)

## statement

Optional is a microscopically small (6 lines) library for Scala to provide a variant of `Option`, called `Optional` that provides an implicitly defined
value. Instead of

    def foo(x: Option[Int]) = x.getOrElse(-1)

    foo(Some(123))

You can now write

    import de.sciss.optional._

    def foo(x: Optional[Int]) = x.getOrElse(-1)

    foo(123)

This is useful for some DSLs where you want to minimise noise for the user.

Optional is (C)opyright 2016 by Hanns Holger Rutz. All rights reserved. FileUtil is released under the [GNU Lesser General Public License](https://raw.github.com/Sciss/Optional/master/LICENSE) v2.1+ and comes with absolutely no warranties. To contact the author, send an email to `contact at sciss.de`.

## requirements / installation

This project compiles against Scala 2.11, 2.10 using sbt 0.13.

To use the library in your project:

    "de.sciss" %% "optional" % v

The current version `v` is `"1.0.0"`

## contributing

Please see the file [CONTRIBUTING.md](CONTRIBUTING.md)
