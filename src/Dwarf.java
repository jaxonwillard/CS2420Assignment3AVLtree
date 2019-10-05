public class Dwarf implements Comparable<Dwarf>{
    String data;
    int which;
   static  int ct = 0;
    public Dwarf(String x){
        data   = x;
        which  = ct++;
    }
    @Override
    public int compareTo(Dwarf b2){
//        String hello = data.compareTo("Hello");
        return (this.data.compareTo( b2.data));
    }
    public String toString(){
        return  data + which;
    }
}

