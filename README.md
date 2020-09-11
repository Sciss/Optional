# Optional

[![Build Status](https://travis-ci.org/Sciss/Optional.svg?branch=main)](https://travis-ci.org/Sciss/Optional)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.sciss/optional_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.sciss/optional_2.13)

## statement

Optional is a microscopically small (6 lines) library for Scala to provide a variant of `Option`, called `Optional` 
that provides an implicitly defined value. Instead of

    def foo(x: Option[Int]) = x.getOrElse(-1)

    foo(Some(123))

You can now write

    import de.sciss.optional._

    def foo(x: Optional[Int]) = x.getOrElse(-1)

    foo(123)

This is useful for some DSLs where you want to minimise noise for the user.

Optional is (C)opyright 2016–2020 by Hanns Holger Rutz. All rights reserved. FileUtil is released under 
the [GNU Lesser General Public License](https://raw.github.com/Sciss/Optional/main/LICENSE) v2.1+ and comes with 
absolutely no warranties. To contact the author, send an e-mail to `contact at sciss.de`.

## requirements / installation

This project compiles against Scala 2.13, 2.12 using sbt. The last version to support Scala 2.11 was v1.0.0.

To use the library in your project:

    "de.sciss" %% "optional" % v

The current version `v` is `"1.0.1"`

## contributing

Please see the file [CONTRIBUTING.md](CONTRIBUTING.md)
