# AdventOfCode2018
My solutions to problems from the Advent of Code 2018 - http://adventofcode.com/2018

```
AdventOfCode2018
│
└─── cli 
│   │The command line interface for displaying the solutions to the 
│   │console
│   │   
│   └─── src/main/scala/missy/adventofcode2018/cli/Main.scala
│        The main method, ie. the thing to run to run all the solutions!
│
└─── project
│    Build related files
│
└─── solutions
│   │Module that contains the actual logic to solve the problems
│   │
│   └─── src
│       │   
│       └─── main
│       │   │   
│       │   └─── resources
│       │   │    Files containing input data for the actual problems
│       │   │   
│       │   └─── scala
│       │        Solution logic 
│       │
│       └─── test
│           │   
│           └─── resources
│           │    Files containing input data for tests extracted from 
│           │    the examples given
│           │   
│           └─── scala
│                Test classes the run through the examples
│
└─── build.sbt
│    sbt build file
│
└─── README.md
     this file
```
