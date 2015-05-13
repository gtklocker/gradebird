# gradebird
This is my attempt at automatically grading university assignments. The style
of grading is inspired by many known algorithmic contests, like
[SPOJ](http://www.spoj.com/) and [Codeforces](http://codeforces.com/).

This is only a prototype and should not be used for serious stuff.

## Usage

    gradebird path/to/ProblemName.java

This assumes that both path/to/ProblemName.$i.{in,out} exist, indicating the
respective input and expected output for each testcase. $i can be any integer
\>= 0. You can have many testcases.

## Disclaimer
It is a bad idea to run this without being sure that the program you're going
to be testing is not malicious. Especially in case you're grading someone
else's code, this better be ran on a Docker container.
