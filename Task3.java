import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> employeeIDs = new LinkedList<>();
        employeeIDs.add(101);
        employeeIDs.add(102);
        employeeIDs.add(103);
        employeeIDs.add(104);
        employeeIDs.add(105);
        System.out.println("Employee IDs:");
        for (Integer id : employeeIDs) {
            System.out.println(id);
        }
    }
}




