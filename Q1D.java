import java.util.ArrayList;
import java.util.List;

class D<T extends Object> {

   private ArrayList<?> list = new ArrayList<>();

   public D() {
   }

   public static <T> List<T> add(List<T> list, T t) {
      List<T> d = new ArrayList<>(list);
      d.add(t);
      return d;
   }

   public static <T, E extends T> List<T> join(List<T> list1, List<E> list2) {
      if (list1 == list2) {
         return list1;
      } else {
         List<T> d = new ArrayList<>();
         d.addAll(list1);
         d.addAll(list2);
         return d;
      }
   }
}
