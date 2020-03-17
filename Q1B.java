   public A{
    int value;
   List<Integer> list;

   public A(int value){
   this.value = value;
   list.add(this.value);
   }

   public A(List<Integer> list){
    this.list = list;
   }

   public A next(int value){
   List<Integer> newList = this.list;
   return new A(newList.add(value));
   }

   public String toString(){
   String temp = "";
   for(Integer value: this.list){
   temp += "[A:" + value +"]";
   }
   return temp;
   }
   }
