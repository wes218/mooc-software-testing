package tudelft.name;

public class WesleyLuong {
    public String getFullName() {
        return "Wesley Luong";
    }
    
    public String getFirstName() {
        return "Wesley";
    }
    
    public String getLastName() {
        return "Luong";
    }
    
    public String getUCInetID() {
        return "wluong3";
    }
    
    public int getStudentNumber() {
    	return 64161478;
    }
    
    public String getRotatedFullName(int shift){
    	shift = shift % "Wesley Luong".length();
        if (shift > 0) {
            return ("Wesley Luong".substring(shift) + "Wesley Luong".substring(0, shift)).strip();
        }
        else if (shift < 0) {
            shift = shift * -1;
            return ("Wesley Luong".substring("Wesley Luong".length() - shift) + "Wesley Luong".substring(0, "Wesley Luong".length() - shift).strip());
        }
        else {
            return "Wesley Luong";
        }
    }
}
