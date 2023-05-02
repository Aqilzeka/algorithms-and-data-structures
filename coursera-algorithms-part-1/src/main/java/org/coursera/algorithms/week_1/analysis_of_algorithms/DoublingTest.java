package org.coursera.algorithms.week_1.analysis_of_algorithms;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class DoublingTest {

  public static double timeTrial(int N) { // Time ThreeSum.count() for N random 6-digit ints.
    int MAX = 1000000;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform(-MAX, MAX);
    }
    Stopwatch timer = new Stopwatch();
    int cnt = ThreeSum.count(a);
    return timer.elapsedTime();
  }

  public static void main(String[] args) { // Print table of running times.
    for (int N = 250; true; N += N) { // Print time for problem size N.
      double time = timeTrial(N);
      StdOut.printf("%7d %5.1f\n", N, time);
    }
  }
}