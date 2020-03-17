   class X{
   int value;
   public X(int value){
   this.value = value;
   }

   public String toString(){
    return "X:" + this value;
   }
   }

   class Y{
   X value;

   public Y(X value){
    this.value = value;
   }

   public String toString(){
    return "Y->" + this.value;
   }
   }
