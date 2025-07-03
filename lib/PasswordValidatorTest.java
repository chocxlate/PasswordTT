package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        
        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเลข "WEAK"
        PasswordStrength result2 = PasswordValidator.validate("12345678");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 1 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected WEAK but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเลขเเละตัวพิมพ์เล็ก "MEDIUM"
        PasswordStrength result3 = PasswordValidator.validate("abcd1234");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 1 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected MEDIUM but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเลข ตัวพิมพ์เล็กเเละตัวพิมพ์ใหญ่ "STRONG"
        PasswordStrength result4 = PasswordValidator.validate("AbcD1357");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 1 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected STRONG but got " + result1);
        }

        System.out.println("--------------------------------");
    }
}
