


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
    
  
    
    public String toString(){
        return "{id :"+id+" name : "+ name+ "}";
    }
    
}

