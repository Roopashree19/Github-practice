import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class listmeow {
public static void main(String[] args){
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(23);
    list.add(45);
    list.add(2);
    list.add(12);
    /*if(list.contains(11)){
        System.out.println("yes the list contains");

    }else{
        System.out.println("no the list don't ");
    }for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
   /* for(int i : list){
        System.out.println(i);
    }*/
    /*list.forEach(System.out::println);*/

   list.stream().filter(e -> e%2==0)
    .collect(Collectors.toList())
    .forEach(System.out::println);

}

}