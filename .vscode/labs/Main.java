// 1. THE ABSTRACT CLASS (The Blueprint)
abstract class Assignment {
    String studentName;
    String status = "Not Submitted";

    Assignment(String name) {
        this.studentName = name;
    }

    // Concrete Method: Every assignment shows status the same way
    void displayStatus() {
        System.out.println("Student: " + studentName + " | Status: " + status);
    }

    // ABSTRACT METHOD: Every assignment MUST define how it's uploaded
    abstract void uploadFile(int fileSizeMb) throws Exception;
}

// 2. CHILD CLASS 1: PDF Submission
class PdfAssignment extends Assignment {
    PdfAssignment(String name) {
        super(name);
    }

    @Override
    void uploadFile(int fileSizeMb) throws Exception {
        // Simple rule: If file > 10MB, it's too big!
        if (fileSizeMb > 10) {
            throw new Exception("PDF File is too large! (Limit 10MB)");
        }
        System.out.println("Reading PDF content...");
        this.status = "PDF Uploaded Successfully";
    }
}

// 3. CHILD CLASS 2: Java Code Submission
class CodeAssignment extends Assignment {
    CodeAssignment(String name) {
        super(name);
    }

    @Override
    void uploadFile(int fileSizeMb) throws Exception {
        // Simple rule: If file > 2MB, it's too big for code!
        if (fileSizeMb > 2) {
            throw new Exception("Code file is too large! (Limit 2MB)");
        }
        System.out.println("Compiling Java Code...");
        this.status = "Code Compiled and Uploaded";
    }
}

// 4. THE MAIN EXECUTION CLASS
public class Main {
    public static void main(String[] args) {
        
        // --- CASE 1: SUCCESSFUL PDF UPLOAD ---
        System.out.println("--- Scenario 1: Alice ---");
        Assignment alice = new PdfAssignment("Alice");
        try {
            alice.uploadFile(5); // 5MB is fine
            alice.displayStatus();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(); // Space for clarity

        // --- CASE 2: FAILED CODE UPLOAD (EXCEPTION) ---
        System.out.println("--- Scenario 2: Bob ---");
        Assignment bob = new CodeAssignment("Bob");
        try {
            // Bob tries to upload a 5MB code file (Limit is 2MB)
            bob.uploadFile(5); 
            bob.displayStatus();
        } catch (Exception e) {
            // This block "catches" the error so the program doesn't crash
            System.out.println("System Alert: " + e.getMessage());
            bob.status