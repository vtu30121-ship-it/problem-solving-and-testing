import java.util.*;
class Student {
    int id; String name; double cgpa;
    Student(int i, String n, double c) {
        id = i; name = n; cgpa = c;
    }
    int getID() { return id; }
    String getName() { return name; }
    double getCGPA() { return cgpa; }
}
class Priorities {
    public List<Student> getStudents(List<String> e) {
        PriorityQueue<Student> q = new PriorityQueue<>((a,b) ->
            a.cgpa != b.cgpa ? Double.compare(b.cgpa,a.cgpa) :
            !a.name.equals(b.name) ? a.name.compareTo(b.name) :
            Integer.compare(a.id,b.id));
        for (String x : e) {
            String[] s = x.split(" ");
            if (s[0].equals("ENTER"))
                q.add(new Student(Integer.parseInt(s[3]),s[1],Double.parseDouble(s[2])));
            else if (!q.isEmpty()) q.poll();
        }
       List<Student> r = new ArrayList<>();
        while (!q.isEmpty()) r.add(q.poll());
        return r;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        List<String> e = new ArrayList<>();
        while(n-- > 0) e.add(sc.nextLine());
        List<Student> r = new Priorities().getStudents(e);
        if(r.isEmpty()) System.out.println("EMPTY");
        else for(Student s:r) System.out.println(s.getName());
    }
}
