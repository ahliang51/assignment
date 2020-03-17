import java.util.ArrayList;
import java.util.List;

class D {

   public D() {
   }

   public static <T> List<T> add(List<T> list, T t) {
      list.add(t);
      return list;
   }

   public static <T, E extends T> List<T> join(List<T> list1, List<E> list2) {
      if (list1 == list2) {
         return list1;
      } else {
         List<T> temp = new ArrayList<>();
         temp.addAll(list1);
         temp.addAll(list2);
         return temp;
      }
   }
}
