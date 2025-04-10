import java.time.Year;

class Student {
    private String name;
    private String branch;
    private String mode;
    private String bloodGroup;
    private String regNo;
    private String email;

    private static int[] regularCount = new int[10];
    private static int[] dsyCount = new int[10];

    public Student(String name, String branch, String mode, String bloodGroup) {
        this.name = name;
        this.branch = branch;
        this.mode = mode;
        this.bloodGroup = bloodGroup;

        int index = getBranchIndex(branch);
        this.regNo = generateRegNo(index, mode);
        this.email = regNo.toLowerCase() + "@sggs.ac.in";
    }

    private int getBranchIndex(String branch) {
        String[] branches = {"mechanical", "civil", "cse", "extc", "it","instrumentation", "production", "chemical", "textile", "electrical"};

        for (int i = 0; i < branches.length; i++) {
            if (branch.equalsIgnoreCase(branches[i])) return i;
        }
        return -1;
    }

    private String generateRegNo(int index, String mode) {
        int year = Year.now().getValue();
        String[] codes = {"bme", "bce", "bcs", "bec", "bit", "bin", "bpr", "bch", "btt", "bel"};
        String code = codes[index];
        int roll;

        if (mode.equalsIgnoreCase("DSY")) {
            roll = 500 + (++dsyCount[index]);
        } else {
            roll = ++regularCount[index];
        }

        return String.format("%d%s%03d", year, code, roll);
    }

        public void printInfo() {
         System.out.printf("%-8s | %-9s | %-7s | %-15s | %-25s | %s\n",
        name, branch.toUpperCase(), mode.toUpperCase(), regNo, email, bloodGroup);
       }

    }
     

public class SMS {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please pass student data as a single string argument.");
            return;
        }

        String[] studentData = args[0].split("\\|");
        Student[] students = new Student[studentData.length];

        for (int i = 0; i < studentData.length; i++) {
            String[] parts = studentData[i].split(",");
            if (parts.length == 4) {
                String name = parts[0];
                String branch = parts[1];
                String mode = parts[2];
                String bloodGroup = parts[3];

                students[i] = new Student(name, branch, mode, bloodGroup);
            } else {
                System.out.println("Invalid data for student " + (i + 1));
            }
        }

        for (Student s : students) {
            s.printInfo();
        }
    }
}

