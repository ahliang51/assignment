   import java.util.Arrays;

   interface TypeCaster<S,T>{
   public T cast(S s,T t){}
   }

   class ToString<S> implements TypeCaster<String,String>{

   public String cast(String s,String t){
   return s;
   }


   }

   class Round implements TypeCaster<Double,Integer>{

   public Integer cast(Double s,Integer t){
   return (int)Math.round(s);
   }
   }

   public ToList<T> implements TypeCaster<T[],List<T>>{

   public List<T> cast(T[] s,List<T> t){
   return Arrays.asList(s);
   }

   }

   public ListCaster{
    static <S,T extends TypeCaster> castList(S s, T t){

   }
   }
