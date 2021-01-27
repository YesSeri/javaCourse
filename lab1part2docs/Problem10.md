# Written Tasks

## Problem 10

### Question 1

When you do x to the power of k it seems to me that k will always affect the value of the expression more than x.
E.g. `3^3`, if you double x it will become `6^3` = `3*3*3*2*2*2` = `3^3*3^2`. If you instead double k it becomes `3^6`
= `3^3*3^3`.

It is quite clear that:

`3^3*3^2` < `3^3*3^3`

I am sure you could write some kind of general formula for this, but I am no mathematician.

### Question 2

I have two graphs attached here, named `graphOne.png` and `graphHalf.png`. The first graph is
the `public static double recRaiseOne(double x, int k)`
function when I map k against number of times the function has been run.

`graphHalf.png` is the other `public static double recRaiseHalf(double x, int k)` function where I have done the same.

### Question 3

The first graph is linear.

### Question 4

if k == 1 => 1
if k > 1 => k

floor(k) to ceiling(k*2-1) => log2(2k)

floor 8 to ceiling 8*2-1 => log2(2*8)

floor 8 to ceiling 15 => log2(16) = 4

```
for k = 1 => 1

For k > 1

for floor(k) ceiling(k + k % (k - k / 2)) => k^2 - 1

floor 2 ceiling 2 + % (2 - 2 / 2) => 2^2 - 1

floor 2 ceiling 3 => 3
```