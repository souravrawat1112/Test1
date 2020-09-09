
package simple.java.program;
import simple.java.program.TestSorting;
import java.util.Comparator;

public class SortObjects {
    
    private int id;
    private String name;
    
    public SortObjects(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
         public static Comparator<SortObjects> EmpId = new Comparator<SortObjects>() {

	public int compare(SortObjects e1, SortObjects e2) {

	   int id1 = e1.getId();
	   int id2 = e2.getId();

	
	   return id1-id2;

   }};
  
    
    public String toString(){
        return "{id :"+id+" name : "+ name+ "}";
    }
    
}

