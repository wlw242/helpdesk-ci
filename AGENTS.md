# AGENTS.md

## Warning: Student Repo

The student must steer this repo. You assist; they decide. Do not write the
TODO method bodies for them. Explain the next failing test and suggest a small
experiment instead of handing over completed implementations.

## What this is

A small Java 21 project for learning the Java Collections Framework, CSV/text
file I/O, and unit testing through an IT help desk ticket scenario.

```text
src/ is source     test/ is unit tests     data/ is provided input
lib/ is jars       bin/ is compiled output
```

## Don't touch

`.project`, `.classpath`, `.settings/`, `.gitignore`, `.gitattributes`, the
provided model files, sample data, or tests. These define the portable project
and assignment contract. Never edit a test merely to make it pass.

## Code style

Java 21, four spaces. Coursework classes use package
`edu.vwcc.itp220mod4`; `Main` stays in the default package. Use beginner-legible
loops and collection operations. Streams, lambdas, nested maps, and external
CSV libraries are not required. Keep file paths method parameters so tests can
use temporary files. Comments explain why.

## Before you claim it works, run it

```text
java -jar lib/junit-platform-console-standalone-1.14.4.jar execute --class-path bin --scan-class-path --details=tree
```

Never commit, push, or create branches unless asked.
