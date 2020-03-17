import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface TypeCaster<S, T> {
   public T cast(S s);
}

class ToString<S> implements TypeCaster<S, String> {

   public String cast(S s) {
      return s.toString();
   }

}

class Round implements TypeCaster<Double, Integer> {

   public Integer cast(Double s) {
      return (int) Math.round(s);
   }

}

class ToList<T> implements TypeCaster<T[], List<T>> {

   public List<T> cast(T[] s) {
      return Arrays.asList(s);

   }
}

class ListCaster {

   static <S, T> List<T> castList(List<S> s, TypeCaster<S, T> t) {
      List<T> newList = new ArrayList<>();
      for (S temp : s) {
         newList.add(t.cast(temp));
      }

      return newList;

   }

}
