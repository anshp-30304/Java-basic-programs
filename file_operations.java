import java.io.*;
import java.util.*;
class operations {
    void create_read_write_modify() {
        try {
            // create a file
            FileWriter myWriter = new FileWriter("filename.txt");
            // writing a file
            myWriter.write("hello world");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            // modifing the file
            FileWriter modifier = new FileWriter("filename.txt");
            modifier.write("modified hello world");
            modifier.close();
            System.out.println("Successfully modified the file.");
            // reading a file
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class file_operations {
    public static void main(String[] args) {
        operations obj = new operations();
        obj.create_read_write_modify();
    }
}
