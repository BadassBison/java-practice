package test;

import log.Log;

public class Test<T> {
  private static Boolean[] results = new Boolean[0];

  private T actual;

  public static void describe(String msg, Runnable testBlock) {
    Log.println("\n" + msg);
    testBlock.run();
    showResults();
  }

  public static void setup() {
    int currentTestCount = results.length;
    Boolean[] newResults = new Boolean[currentTestCount + 1];
    for (int i = 0; i < currentTestCount; i++) {
      newResults[i] = results[i];
    }
    results = newResults;
  }

  public static void showResults() {
    for (int i = 0; i < results.length; i++) {
      Log.println("\t" + (i + 1) + ") " + (results[i] ? "Passed" : "Failed"));
    }
    results = new Boolean[0];
  }

  // String Factory
  public static Test<String> expect(String _actual) {
    setup();
    return new Test<String>(_actual);
  }

  // Integer Factory
  public static Test<Integer> expect(int _actual) {
    setup();
    return new Test<Integer>(_actual);
  }

  // Double Factory
  public static Test<Double> expect(double _actual) {
    setup();
    return new Test<Double>(_actual);
  }

  // Boolean Factory
  public static Test<Boolean> expect(boolean _actual) {
    setup();
    return new Test<Boolean>(_actual);
  }

  // Constructor
  public Test(T _actual) {
    actual = _actual;
  }

  // String asserts -----------------------------------------
  public void toEqual(String expected) {
    results[results.length - 1] = ((String) actual).equals(expected);
  }

  public void toNotEqual(String expected) {
    results[results.length - 1] = !((String) actual).equals(expected);
  }

  public void toEqualIgnoreCase(String expected) {
    results[results.length - 1] = ((String) actual).equalsIgnoreCase(expected);
  }

  public void toNotEqualIgnoreCase(String expected) {
    results[results.length - 1] = !((String) actual).equalsIgnoreCase(expected);
  }

  public void toContain(String expected) {
    results[results.length - 1] = ((String) actual).indexOf(expected) >= 0;
  }

  // Integer asserts ----------------------------------------
  public void toEqual(int expected) {
    results[results.length - 1] = (int) actual == expected;
  }

  public void toNotEqual(int expected) {
    results[results.length - 1] = (int) actual != expected;
  }

  public void toBeGreaterThan(int expected) {
    results[results.length - 1] = (int) actual > expected;
  }

  public void toBeGreaterThanOrEqualTo(int expected) {
    results[results.length - 1] = (int) actual >= expected;
  }

  public void toBeLessThan(int expected) {
    results[results.length - 1] = (int) actual < expected;
  }

  public void toBeLessThanOrEqualTo(int expected) {
    results[results.length - 1] = (int) actual >= expected;
  }

  // Double asserts ----------------------------------------
  public void toEqual(double expected) {
    results[results.length - 1] = (double) actual == expected;
  }

  public void toNotEqual(double expected) {
    results[results.length - 1] = (double) actual != expected;
  }

  public void toBeGreaterThan(double expected) {
    results[results.length - 1] = (double) actual > expected;
  }

  public void toBeGreaterThanOrEqualTo(double expected) {
    results[results.length - 1] = (double) actual >= expected;
  }

  public void toBeLessThan(double expected) {
    results[results.length - 1] = (double) actual < expected;
  }

  public void toBeLessThanOrEqualTo(double expected) {
    results[results.length - 1] = (double) actual >= expected;
  }

  // Boolean asserts ----------------------------------------
  public void toBeTruthy() {
    results[results.length - 1] = (boolean) actual == true;
  }

  public void toBefalsey() {
    results[results.length - 1] = (boolean) actual == false;
  }
}
