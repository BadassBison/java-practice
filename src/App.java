import test.Test;
// import log.Log;
import practice.NumOfDaysInMonth;

public class App {
    public static void main(String[] args) throws Exception {
        // String a = "a";
        // String b = "b";
        // String A = "A";
        // String sub = "substring";

        // String tests
        // Test.describe("String tests", () -> {
        // Test.expect(a).toEqualIgnoreCase(A);
        // Test.expect(a).toNotEqual(b);
        // Test.expect(a).toEqual(a);
        // Test.expect(sub).toContain("bstr");
        // });

        // Test.describe("Integer tests", () -> {
        // Test.expect(1).toBeGreaterThan(2);
        // });

        Test.describe("NumOfDaysInMonth month = 1, year = 2000", () -> {
            Test.expect(NumOfDaysInMonth.getDays(1, 2000)).toEqual(31);
        });

        Test.describe("NumOfDaysInMonth month = 1, year = 2000", () -> {
            Test.expect(NumOfDaysInMonth.getDays(2, 2000)).toEqual(29);
            Test.expect(NumOfDaysInMonth.getDays(2, 2100)).toEqual(28);
            Test.expect(NumOfDaysInMonth.getDays(2, 2020)).toEqual(29);
            Test.expect(NumOfDaysInMonth.getDays(2, 1997)).toEqual(28);
            Test.expect(NumOfDaysInMonth.getDays(3, 2020)).toEqual(31);
            Test.expect(NumOfDaysInMonth.getDays(4, 2020)).toEqual(30);
            Test.expect(NumOfDaysInMonth.getDays(5, 2020)).toEqual(31);
            Test.expect(NumOfDaysInMonth.getDays(6, 2020)).toEqual(30);
            Test.expect(NumOfDaysInMonth.getDays(7, 2020)).toEqual(31);
            Test.expect(NumOfDaysInMonth.getDays(8, 2020)).toEqual(31);
            Test.expect(NumOfDaysInMonth.getDays(9, 2020)).toEqual(30);
            Test.expect(NumOfDaysInMonth.getDays(10, 2020)).toEqual(31);
            Test.expect(NumOfDaysInMonth.getDays(11, 2020)).toEqual(30);
            Test.expect(NumOfDaysInMonth.getDays(12, 2020)).toEqual(31);
        });

        // Log.printf("money", 2.994005, "My money");
    }
}
