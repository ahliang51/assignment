import java.util.ArrayList;
import java.util.List;

class A {
   int value;
   List<Integer> list;

   public A(int value) {
      this.value = value;
      this.list = new ArrayList<>();
      list.add(this.value);
   }

   public A(List<Integer> list) {
      this.list = list;
   }

   public A next(int value) {
      List<Integer> newList = new ArrayList<>(this.list);
      newList.add(value);
      return new A(newList);
   }

   public String toString() {
      String temp = "";
      for (Integer value : this.list) {
         temp += "[A:" + value + "]";
      }
      return temp;
   }
}
