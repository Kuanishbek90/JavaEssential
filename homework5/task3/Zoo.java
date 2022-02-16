package homework5.task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
       arrayList.add(0,"bear");
       arrayList.add(1,"tiger");
       arrayList.add(2,"rabbit");
       arrayList.add(3,"horse");
       arrayList.add(4,"dog");
       arrayList.add(5,"cat");
       arrayList.add(6,"mouse");
       arrayList.add(7,"elephant");
       arrayList.add(8,"pig");
       arrayList.add(9,"gorilla");
        for (String s:arrayList) {
            System.out.println(s);
            
        }

        
        System.out.println("Размер списка = " + arrayList.size());
//        arrayList.remove(7);
//        arrayList.remove(5);
//        arrayList.remove(3);
        System.out.println("Remote animal");
        System.out.println(arrayList.remove(7));
        System.out.println(arrayList.remove(5));
        System.out.println(arrayList.remove(3));
        

        System.out.println("Размер списка после удаление = " + arrayList.size());
    }
}

