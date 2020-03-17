class Parent {
   String value;

   Parent(String value) {
      this.value = value;
   }

   Parent add(Parent value) {
      return new Parent(this.value + value);
   }

   public String toString() {
      return this.value;
   }
}

class B extends Parent {
   String value;

   public B() {
      super("B");
   }

   public String toString() {
      return super.toString();
   }
}

class C extends Parent {
   String value;

   public C() {
      super("C");
   }

   public String toString() {
      return super.toString();
   }
}
