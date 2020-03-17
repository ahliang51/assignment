   class D<T extends E> {

   private ArrayList<T> list = new ArrayList<>();

   public D(){
   }

   public static <T>  D<T> add(ArrayList<T> list, T t){
   D d = new D<>();
   d.list.addAll(list);
   d.list.add(t);
   return d;
   }

   public static List join(List<T> list1,List<T>list2){
    d.list.addAll(list);
   }
   }
