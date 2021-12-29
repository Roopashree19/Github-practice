  import java.util.ArrayDeque;
    import java.util.Queue;
    public class queuemeow{
   public static void main(String[] args){
        Queue<String> q = new ArrayDeque<>();
           
        q.offer("jyothi");
        q.offer("Aaryan");
        q.forEach(System.out::println);
    }
}