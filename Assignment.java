import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.lang.model.util.ElementScanner14;
public class Assignment {
    public static int posStd1 = 0;
    public static int posStd2 = 0;
    public static int posStd3 = 0;

    public static void main(String[] args) {
        String[] student1 = new String[7];
        String[] student2 = new String[7];
        String[] student3 = new String[7];
        Scanner input = new Scanner(System.in);
        int a = 1;

        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("          -----------------------------");
            System.out.println("          View as a Student or Teacher");
            System.out.println("          Choose 1 For Student");
            System.out.println("          Choose 2 for teacher");
            System.out.println("          Choose 3 for Exit from the program");
            
            int x = input.nextInt();
            if (x == 1) {
                Student(student1, student2, student3);
            } else if (x == 2) {
                Teacher(student1, student2, student3);

            } else {
                System.out.println("That's All");
                break ;
            }
        } while (a > 0);
    }
    public static void Student(String[] student1, String[] student2, String[] student3)
    {
        Scanner input = new Scanner(System.in);
        int a = 1 ;
        do{
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("          Choose 1 for Add Student Data");
            System.out.println("          Choose 2 for View Student Data");
            System.out.println("          Choose 3 for Add new course for given student");
            System.out.println("          Choose 4 for remove course");
            System.out.println("          Choose 5 for go back");
            int x = input.nextInt();
            if (x == 1) {
                StudentsData(student1, student2, student3);
            }
            else if (x == 2) {
                    viewStudentData(student1, student2, student3);
            } else if (x == 3) {
                    addStudentData(student1, student2, student3);
            } else if(x==4) {     
                    removeCourseData(student1,student2,student3);
            } else if(x==5) {
                    break ;
            }
            else{
                break ;
            }

        }while(a>0);
    }

    public static void Teacher(String[] student1, String[] student2, String[] student3){

        Scanner input = new Scanner(System.in);
        System.out.println("          Which Course Teacher are you?");
        System.out.println("          Choose 1 for CSE");
        System.out.println("          Choose 2 for MATH");
        System.out.println("          Choose 3 for PHY");
        int a = input.nextInt();
        if(a==1){
            // cse teacher
            System.out.println();
            System.out.println();
            System.out.println("Welcome Shafin Rahman ");
            System.out.println();
            System.out.println();
            System.out.println("Your Students name are: ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("CSE"==student1[i]){
                    System.out.print(student1[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("CSE"==student2[i]){
                    System.out.print(student2[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("CSE"==student3[i]){
                    System.out.print(student3[0]+" ");
                }
                
            }
            System.out.println();
            System.out.println("Your Sections are : ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("CSE"==student1[i]){
                    System.out.print(student1[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("CSE"==student2[i]){
                    System.out.print(student2[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("CSE"==student3[i]){
                    System.out.print(student3[i+1]+" ");
                }
                
            }
            System.out.println();


        }
        else if (a==2){ 
            //math teacher 
            System.out.println();
            System.out.println();
            System.out.println("Welcome Tanzilah Noor Shabnam ");
            System.out.println();
            System.out.println();
            System.out.println("Your Students name : ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("MATH"==student1[i]){
                    System.out.print(student1[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("MATH"==student2[i]){
                    System.out.print(student2[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("MATH"==student3[i]){
                    System.out.print(student3[0]+" ");
                }
                
            }
            System.out.println();
            System.out.println("Your Sections are : ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("MATH"==student1[i]){
                    System.out.print(student1[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("MATH"==student2[i]){
                    System.out.print(student2[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("MATH"==student3[i]){
                    System.out.print(student3[i+1]+" ");
                }
                
            }
            System.out.println();

        }
        else{
            //phy teacher 
            System.out.println();
            System.out.println();
            System.out.println("Welcome Farah Dibah ");
            System.out.println();
            System.out.println();
            System.out.println("Your Students name : ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("PHY"==student1[i]){
                    System.out.print(student1[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("PHY"==student2[i]){
                    System.out.print(student2[0]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("PHY"==student3[i]){
                    System.out.print(student3[0]+" ");
                }
                
            }
            System.out.println();
            System.out.println("Your Sections are : ");
            for (int i = 0; i <= posStd1  ; i++) {
                if("PHY"==student1[i]){
                    System.out.print(student1[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd2  ; i++) {
                if("PHY"==student2[i]){
                    System.out.print(student2[i+1]+" ");
                }
                
            }
            for (int i = 0; i <= posStd3  ; i++) {
                if("PHY"==student3[i]){
                    System.out.print(student3[i+1]+" ");
                }
                
            }
            System.out.println();

        }

    }

    public static void addStudentData(String[] student1, String[] student2, String[] student3) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select student to add course");
        System.out.println("(press 1 for student 1 , press 2 for student 2 and press 3 for student 3)");
        int k = input.nextInt();
        if (k == 1) {
            System.out.println("          This time How many course you want to add?");
            int x = input.nextInt();
            for (int i = (posStd1+1) ; i <= ((2 * x) + posStd1); i++) {
                if (i % 2 == 0) {
                    printSection();
                    System.out.println("          Which Section do you take?");
                    System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                    int a = input.nextInt();
                    student1[i] = Section(a);
                } else {
                    printCourse();
                    System.out.println("          Which course do you wanna take?");
                    System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                    int a = input.nextInt();
                    student1[i] = Course(a);
                }
            }
            posStd1 = (2 * x) + posStd1 ;

        } else if (k == 2) {
            System.out.println("This time How many course you want to add?");
            int x = input.nextInt();
            for (int i = posStd2+1 ; i <= (2 * x) + posStd2; i++) {
                if (i % 2 == 0) {
                    printSection();
                    System.out.println("          Which Section do you take?");
                    System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                    int a = input.nextInt();
                    student2[i] = Section(a);
                } else {
                    printCourse();
                    System.out.println("          Which course do you wanna take?");
                    System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                    int a = input.nextInt();
                    student2[i] = Course(a);
                }
            }
            posStd2 = (2 * x) + posStd2 ;
        } else {
            System.out.println("This time How many course you want to add?");
            int x = input.nextInt();
            for (int i = posStd3+1 ; i <= (2 * x) + posStd3; i++) {
                if (i % 2 == 0) {
                    printSection();
                    System.out.println("          Which Section do you take?");
                    System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                    int a = input.nextInt();
                    student3[i] = Section(a);
                } else {
                    printCourse();
                    System.out.println("          Which course do you wanna take?");
                    System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                    int a = input.nextInt();
                    student3[i] = Course(a);
                }
            }
            posStd3 = (2 * x) + posStd3 ;
        }

    }

    public static void viewStudentData(String[] student1, String[] student2, String[] student3) {
        Scanner input = new Scanner(System.in);
        System.out.println("          Which Student Data you want to see?");
        System.out.println("          (Press 1 for student 1 , 2 for student 2 , 3 for student 3)");
        int x = input.nextInt();
        if (x == 1) {
            System.out.println();
            System.out.println("Your Name Course and Section is : ");
            for (int i = 0; i <= posStd1; i++) {
                if(student1[i]=="null")
                {
                    continue ;
                }
                else{
                    System.out.print(student1[i] + " ");
                }
                
            }
        } else if (x == 2) {
            System.out.println();
            System.out.println("Your Name Course and Section is : ");
            for (int i = 0; i <= posStd2; i++) {
                if(student2[i]=="null")
                {
                    continue ;
                }
                else{
                    System.out.print(student2[i] + " ");
                }
            }
        } else {
            System.out.println();
            System.out.println("Your Name Course and Section is : ");
            for (int i = 0; i <= posStd3; i++) {
                if(student3[i]=="null")
                {
                    continue ;
                }
                else{
                    System.out.print(student3[i] + " ");
                }
            }
        }

    }

    public static void StudentsData(String[] student1, String[] student2, String[] student3) {

        Scanner input = new Scanner(System.in);
        System.out.println("          Enter Students Data");
        System.out.println("          -------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("          (press 1 for student 1,  press 2 for student 2  , press 3 for student 3)");
            int stdno = input.nextInt();
            if (stdno == 1) {
                Std1(student1);
            } else if (stdno == 2) {
                Std2(student2);
            } else if (stdno == 3) {
                Std3(student3);
            }
            System.out.println("          Add another one student data");
        }
        System.out.println("          All Student data added");
    }

    public static void Std1(String[] student1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        student1[0] = input.nextLine();
        System.out.println("How many courses you want to take ");
        int x = input.nextInt();
        posStd1 = 2 * x;
        for (int i = 1; i <= (2 * x); i++) {
            if (i % 2 == 0) {
                printSection();
                System.out.println("          Which Section do you take?");
                System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                int a = input.nextInt();
                student1[i] = Section(a);
            } else {
                printCourse();
                System.out.println("          Which course do you wanna take?");
                System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                int a = input.nextInt();
                student1[i] = Course(a);
            }
        }
        if(x==1)
        {
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.printf("%s took %d courses\n",student1[0],x);
            System.out.println("Do you want to take another 1 or 2 courses? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                System.out.println("How many extra course you wannt to take ?  ( Press 1 for 1 course )( Press 2 for 2 Course) ");
                int t = input.nextInt();
                if(t==1){
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd1 = (2 * x)+2;
                    }
                }
                else if(t==2){
                    for (int i = (2*x)+1 ; i <= (2 * x)+4; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd1 = (2 * x)+4;
                    }

                    
                }
                else {
                    System.out.println("Invalid");
                }
            }

        }
        else if(x==2){
            System.out.printf(" %s took %d courses \n",student1[0],x);
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.println("Do you want to take another 1 course? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                    }
                    posStd1 = (2 * x)+2;
            }

        }
        else{
            System.out.printf(" %s took 3 courses ",student1[0]);
        }

    }

    public static void Std2(String[] student1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        student1[0] = input.nextLine();
        System.out.println("How many courses you want to take ");
        int x = input.nextInt();
        posStd2 = 2 * x;
        for (int i = 1; i <= (2 * x); i++) {
            if (i % 2 == 0) {
                printSection();
                System.out.println("          Which Section do you take?");
                System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                int a = input.nextInt();
                student1[i] = Section(a);
            } else {
                printCourse();
                System.out.println("          Which course do you wanna take?");
                System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                int a = input.nextInt();
                student1[i] = Course(a);
            }
        }
        if(x==1)
        {
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.printf("%s took %d courses\n",student1[0],x);
            System.out.println("Do you want to take another 1 or 2 courses? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                System.out.println("How many extra course you wannt to take ?  ( Press 1 for 1 course )( Press 2 for 2 Course) ");
                int t = input.nextInt();
                if(t==1){
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd2 = (2 * x)+2;
                    }
                }
                else if(t==2){
                    for (int i = (2*x)+1 ; i <= (2 * x)+4; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd2 = (2 * x)+4;
                    }

                    
                }
                else {
                    System.out.println("Invalid");
                }
            }

        }
        else if(x==2){
            System.out.printf(" %s took %d courses \n",student1[0],x);
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.println("Do you want to take another 1 course? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                    }
                    posStd2 = (2 * x)+2;
            }

        }
        else{
            System.out.printf(" %s took 3 courses ",student1[0]);
        }
    }

    public static void Std3(String[] student1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        student1[0] = input.nextLine();
        System.out.println("How many courses you want to take ");
        int x = input.nextInt();
        posStd3 = 2 * x;
        for (int i = 1; i <= (2 * x); i++) {
            if (i % 2 == 0) {
                printSection();
                System.out.println("          Which Section do you take?");
                System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                int a = input.nextInt();
                student1[i] = Section(a);
            } else {
                printCourse();
                System.out.println("          Which course do you wanna take?");
                System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                int a = input.nextInt();
                student1[i] = Course(a);
            }
        }
        if(x==1)
        {
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.printf("%s took %d courses\n",student1[0],x);
            System.out.println("Do you want to take another 1 or 2 courses? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                System.out.println("How many extra course you wannt to take ?  ( Press 1 for 1 course )( Press 2 for 2 Course) ");
                int t = input.nextInt();
                if(t==1){
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd3 = (2 * x)+2;
                    }
                }
                else if(t==2){
                    for (int i = (2*x)+1 ; i <= (2 * x)+4; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                        posStd3 = (2 * x)+4;
                    }

                    
                }
                else {
                    System.out.println("Invalid");
                }
            }

        }
        else if(x==2){
            System.out.printf(" %s took %d courses \n",student1[0],x);
            //System.out.println(Student1[0]+" took "+x+" courses.");
            System.out.println("Do you want to take another 1 course? ( Press 1 for YES )( Press 2 for NO) ");
            int r = input.nextInt() ;
            if(r==2){
                System.out.println();
            }
            else
            {
                    for (int i = (2*x)+1 ; i <= (2 * x)+2; i++) {
                        if (i % 2 == 0) {
                            printSection();
                            System.out.println("          Which Section do you take?");
                            System.out.println("          (Press 1 for Section 1, 2 for Section 2,3 for Section 3)");
                            int a = input.nextInt();
                            student1[i] = Section(a);
                        } else {
                            printCourse();
                            System.out.println("          Which course do you wanna take?");
                            System.out.println("          (Press 1 for cse , 2 for math , 3 for phy)");
                            int a = input.nextInt();
                            student1[i] = Course(a);
                        }
                    }
                    posStd3 = (2 * x)+2;
            }

        }
        else{
            System.out.printf(" %s took 3 courses ",student1[0]);
        }
    }
    public static void removeCourseData(String[] student1, String[] student2, String[] student3){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("                    Which Student data you want to remove?");
        System.out.println("Press 1 for student 1 , Press 2 for student 2 , Press 3 for student 3 ");
        int t= input.nextInt();
        if(t==1)
        {
            System.out.println("                     Welcome "+student1[0]);
            System.out.println("(Which course do you wanna drop?)");
            printCourse();
            System.out.print("Press = ");
            int x = input.nextInt();
            if(x==1)
            {
                for (int i = 0; i < student1.length; i++) {
                    if(student1[i]=="CSE")
                    {
                        student1[i]="null";
                        student1[i+1]="null";
                    }   
                }
            }
            else if(x==2)
            {
                for (int i = 0; i < student1.length; i++) {
                    if(student1[i]=="MATH")
                    {
                        student1[i]="null";
                        student1[i+1]="null";
                    }   
                }
            }
            else if(x==3)
            {
                for (int i = 0; i < student1.length; i++) {
                    if(student1[i]=="PHY")
                    {
                        student1[i]="null";
                        student1[i+1]="null";
                    }   
                }
            }
        }
        else if(t==2){
            System.out.println("                     Welcome "+student2[0]);
            System.out.println("(Which course do you wanna drop?)");
            printCourse();
            System.out.print("Press = ");
            int x = input.nextInt();
            if(x==1)
            {
                for (int i = 0; i < student2.length; i++) {
                    if(student2[i]=="CSE")
                    {
                        student2[i]="null";
                        student2[i+1]="null";
                    }   
                }
            }
            else if(x==2)
            {
                for (int i = 0; i < student2.length; i++) {
                    if(student2[i]=="MATH")
                    {
                        student2[i]="null";
                        student2[i+1]="null";
                    }   
                }
            }
            else if(x==3)
            {
                for (int i = 0; i < student2.length; i++) {
                    if(student2[i]=="PHY")
                    {
                        student2[i]="null";
                        student2[i+1]="null";
                    }   
                }
            }
        }
        else if(t==3){
            System.out.println("                     Welcome "+student3[0]);
            System.out.println("(Which course do you wanna drop?)");
            printCourse();
            System.out.print("Press = ");
            int x = input.nextInt();
            if(x==1)
            {
                for (int i = 0; i < student3.length; i++) {
                    if(student3[i]=="CSE")
                    {
                        student3[i]="null";
                        student3[i+1]="null";
                    }   
                }
            }
            else if(x==2)
            {
                for (int i = 0; i < student3.length; i++) {
                    if(student3[i]=="MATH")
                    {
                        student3[i]="null";
                        student3[i+1]="null";
                    }   
                }
            }
            else if(x==3)
            {
                for (int i = 0; i < student3.length; i++) {
                    if(student3[i]=="PHY")
                    {
                        student3[i]="null";
                        student3[i+1]="null";
                    }   
                }
            }
        }

    }

    

    public static void printCourse() {
        System.out.println("          1. CSE");
        System.out.println("          2. MATH");
        System.out.println("          3. PHY");
    }

    public static String Course(int x) {
        if (x == 1)
            return "CSE";
        else if (x == 2)
            return "MATH";
        else if (x == 3)
            return "PHY";
        else {
            return "nothing";
        }
    }

    public static void printSection() {
        System.out.println("          Section 1");
        System.out.println("          Section 2");
        System.out.println("          Section 3");
    }

    public static String Section(int x) {
        if (x == 1)
            return "1";
        else if (x == 2)
            return "2";
        else if (x == 3)
            return "3";
        else {
            return "nothing";
        }
    }
}