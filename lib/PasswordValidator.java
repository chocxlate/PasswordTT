package lib;

public class PasswordValidator {

    /**
     * ฟังก์ชัน validate นี้หาความยากง่ายของรหัสผ่าน ถ้ารหัสผ่านคุฯมีไม่ถึง 8 ตัว ฟังก์ชันจะส่ง "INVALID" กลับไป 
     * เเต่ถ้ารหัสผ่านคุณมี 8 ตัว ฟังก์ชันจะทำการเช็คเป็น 3 กรณื 1.ถ้ารหัสคุณมีเเค่ตัวเลข จะส่ง "WEAK" กลับไป
     * 2.ถ้ารหัสคุณมีตัวเลขเเละตัวพิมพ์เล็ก จะส่ง "MEDIUM" กลับไป 3.ถ้ารหัสคุณมีตัวเลขเเละมีทั้งตัวพิมพ์เล็กเเละพิมพ์ใหญ่ จะส่ง "STRONG" กลับไป
     * @param passwork ที่ต้องการตรวจสอบ
     * @return บอกความยากง่ายของรหัสคุณ
     */

    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        boolean low = false ;
        boolean high = false ;
        boolean digit = false ;

        if(password == null || password.length() < minLength){
            return PasswordStrength.INVALID ;
        }
        
        for(int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                digit = true;
            }
            if(Character.isLowerCase(c)){
                low = true;
            }
            if(Character.isUpperCase(c)){
                high = true ;
            }
        }
        if(digit && low && high){
            return PasswordStrength.STRONG;
        }
        else if(digit && low){
            return PasswordStrength.MEDIUM;
        }
        else return PasswordStrength.WEAK ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?

        
    }
        
}