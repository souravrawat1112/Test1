
package simple.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class TestSorting 
{
    public static void main(String[] args) 
    {
        SortObjects e1 = new SortObjects(1, "Charly");
        SortObjects e2 = new SortObjects(10, "Rawat");
        SortObjects e3 = new SortObjects(5, "Binod");
        SortObjects e4 = new SortObjects(4, "Boy");
        SortObjects e5 = new SortObjects(8,"Prashant");
 
        List<SortObjects> employees = new ArrayList<SortObjects>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

 
       Collections.sort(employees,SortObjects.EmpId);
 
       
        System.out.println(employees);
    }
}