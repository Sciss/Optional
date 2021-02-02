# Optional

[![Build Status](https://github.com/Sciss/Optional/workflows/Scala%20CI/badge.svg?branch=main)](https://github.com/Sciss/Optional/actions?query=workflow%3A%22Scala+CI%22)
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

Optional is (C)opyright 2016–2021 by Hanns Holger Rutz. All rights reserved. FileUtil is released under 
the [GNU Lesser General Public License](https://raw.github.com/Sciss/Optional/main/LICENSE) v2.1+ and comes with 
absolutely no warranties. To contact the author, send an e-mail to `contact at sciss.de`.

## requirements / installation

This project builds with sbt against Scala 2.13, 2.12, Dotty (JVM) and Scala 2.13 (JS).
The last version to support Scala 2.11 was v1.0.0.

To use the library in your project:

    "de.sciss" %% "optional" % v

The current version `v` is `"1.0.1"`

## contributing

Please see the file [CONTRIBUTING.md](CONTRIBUTING.md)
