import javax.xml.transform.Source;
import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1 : Create a Java program that stores names using ArrayList.

//        ArrayList <String> studentName = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 student names");
//        for(int i = 1; i < 6; i++){
//            System.out.println(i+" :");
//            studentName.add(sc.next());
//        }
//        Collections.sort(studentName);
//        System.out.println("Names of all the students -: "+ studentName);
//
//        System.out.println("Enter student name to remove : ");
//        String removeName = sc.next();
//        studentName.remove(removeName);
//        System.out.println(studentName);

        //Task 2 : Use a HashSet to store unique student IDs.

//        HashSet<Integer> studentId = new HashSet<>();
//        System.out.println("Enter total number of id");
//        int totalStd = sc.nextInt();
//        for(int i= 1; i <= totalStd; i++){
//            studentId.add(sc.nextInt());
//        }
//        System.out.println("All the student id -: "+studentId);
//
//        System.out.println("Enter id to check -: ");
//        int id = sc.nextInt();
//        if(studentId.contains(id)){
//            System.out.println(id+" Already exists! ");
//        }else {
//            System.out.println(id+" Does not exists!");
//        }

       // Task 3 : Use a HashMap to store employee name–salary pairs.
//        HashMap <String,Integer> employee = new HashMap<>();
//        System.out.println("Enter total number of employees");
//        int size = sc.nextInt();
//        for(int i = 1; i<=size;i++){
//            employee.put(sc.next(),sc.nextInt());
//        }
//        System.out.println("Employees "+employee);
//        System.out.println("Enter the employee name to update salary");
//        String name = sc.next();
//
//        int salary = sc.nextInt();
//        if(employee.containsKey(name)){
//            System.out.println("Enter updated salary");
//            employee.put(name,salary);
//        }
//        System.out.println("Updated salary with employees "+employee);
//        System.out.println("Enter employee name to remove");
//        String removeName = sc.next();
//        if(employee.containsKey(removeName)){
//            employee.remove(removeName);
//        }else {
//            System.out.println("Employee does not ");
//        }
//        System.out.println("Updated employees List after removing "+employee);


        //Task 4 : Implement a simple to-do list using a LinkedList.
//        LinkedList<String> tasks = new LinkedList<>();
//
//        System.out.print("How many tasks to add? ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < n; i++) {
//            tasks.add(sc.nextLine());
//        }
//
//        System.out.println("Your To-Do List: " + tasks);
//
//        System.out.print("Enter completed task name to remove: ");
//        tasks.remove(sc.nextLine());
//
//        System.out.println("Updated: " + tasks);

        //Task 5 : Save notes entered by the user into a text file.
//        StringBuilder notes = new StringBuilder();
//
//        System.out.println("Enter your notes (type END to finish):");
//
//        while (true) {
//            String line = sc.nextLine();
//            if (line.equalsIgnoreCase("END")) {
//                break;
//            }
//            notes.append(line).append("\n");
//        }
//
//        try (FileWriter fw = new FileWriter("notes.txt")) {
//            fw.write(notes.toString());
//            System.out.println("\nNotes saved successfully!");
//        } catch (IOException e) {
//            System.out.println("Error while saving notes: " + e.getMessage());
//        }
//
//        System.out.println("\nReading notes from file:");
//        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
//            String fileLine;
//            while ((fileLine = br.readLine()) != null) {
//                System.out.println(fileLine);
//            }
//        } catch (IOException e) {
//            System.out.println("Error while reading notes: " + e.getMessage());
//        }


        //Task 6 :Read a file and count the number of words.
//        int wordCount = 0;
//        try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
//            String line;
//            while((line = br.readLine()) !=null){
//                String []words = line.trim().split("\\s+");
//                if(!line.trim().isEmpty()){
//                    wordCount += words.length;
//                }
//            }
//            System.out.println("Total words : " + wordCount);
//        }catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
//        }

        //Task 7 : Copy data from one text file to another.
//        String sourceFile = "notes.txt";
//        String destinationFile = "destination.txt";
//
//        try (
//                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
//                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))
//        ) {
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                bw.write(line);
//                bw.newLine();
//            }
//
//            System.out.println("File copied successfully!");
//
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }


        //Task 8 : Manage a list of contacts using ArrayList and save them to a file.

//        ArrayList<String> contacts = new ArrayList<>();
//
//        try {
//            File f = new File("contacts.txt");
//            if (f.exists()) {
//                BufferedReader br = new BufferedReader(new FileReader(f));
//                String line;
//                while ((line = br.readLine()) != null) contacts.add(line);
//                br.close();
//            }
//        } catch(Exception e){}
//
//        try {
//            while (true) {
//                System.out.print("Enter name (STOP to end): ");
//                String name = sc.nextLine();
//                if (name.equalsIgnoreCase("STOP")) break;
//                System.out.print("Enter phone: ");
//                String phone = sc.nextLine();
//                contacts.add(name + "," + phone);
//            }
//        } catch(Exception e){}
//
//        try {
//            System.out.print("Search name: ");
//            String search = sc.nextLine();
//            boolean found = false;
//            for (String c : contacts) {
//                String[] arr = c.split(",");
//                if (arr[0].equalsIgnoreCase(search)) {
//                    System.out.println(c);
//                    found = true;
//                }
//            }
//            if (!found) System.out.println("Not found");
//        } catch(Exception e){}
//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("contacts.txt"));) {
//            for (String c : contacts) bw.write(c + "\n");
//            bw.close();
//            System.out.println("Saved");
//        } catch(Exception e){
//            System.out.println("Error"+e.getMessage());
//        }


        //Task 9 : Student Record System
        HashMap<String,Integer> students = new HashMap<>();

        try {
            File f = new File("students.txt");
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] arr = line.split(",");
                    students.put(arr[0], Integer.parseInt(arr[1]));
                }
                br.close();
            }
        } catch(Exception e){}

        try {
            while (true) {
                System.out.print("Enter name (STOP to end): ");
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("STOP")) break;
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();
                students.put(name, marks);
            }
        } catch(Exception e){}

        try {
            for (String k : students.keySet())
                System.out.println(k + " -> " + students.get(k));
        } catch(Exception e){}

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            for (String k : students.keySet())
                bw.write(k + "," + students.get(k) + "\n");
            bw.close();
            System.out.println("Saved");
        } catch(Exception e){}
    }
}