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

The first graph shows an exponential growth.

### Question 4

The second graph is more interesting. It seems to be a linear graph between certain values but approx. every k^2 the
linear graph gets steeper.

When I run it with the x = k I get a similar graph. I did however find one interesting thing. I run this function here:

```
for (int k = 1; k <= 20; k++) {
    Raise.runBoth(x, k);
    double counter = Raise.recHalfCounter;
    System.out.println("k: " + k + ", counter:" + counter + ", counter - prevCounter:" + (counter-prevRecHalfCounter));
    prevRecHalfCounter = counter;
}
```

And it gave me the following output.

```
k: 1, counter:3, counter - prevCounter:3.0
k: 2, counter:10, counter - prevCounter:7.0
k: 3, counter:17, counter - prevCounter:7.0
k: 4, counter:32, counter - prevCounter:15.0
k: 5, counter:47, counter - prevCounter:15.0
k: 6, counter:62, counter - prevCounter:15.0
k: 7, counter:77, counter - prevCounter:15.0
k: 8, counter:108, counter - prevCounter:31.0
k: 9, counter:139, counter - prevCounter:31.0
k: 10, counter:170, counter - prevCounter:31.0
k: 11, counter:201, counter - prevCounter:31.0
k: 12, counter:232, counter - prevCounter:31.0
k: 13, counter:263, counter - prevCounter:31.0
k: 14, counter:294, counter - prevCounter:31.0
k: 15, counter:325, counter - prevCounter:31.0
k: 16, counter:388, counter - prevCounter:63.0
```

When the value of `counter - prevCounter` changes (`7-3`) the first time it changes with 4 then 8 then 16 then 32 and so
on. Number of times a `counter - prevcounter` value is repeated is also x^2. First 1, then 2 then 4 then 8 and so on.

This is the same no matter what value of x.

I have no idea how to formulate a formula for this. 