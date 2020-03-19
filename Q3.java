   import java.util.Map;
   import java.util.Set;

   Enum Nature{
   CASUAL,CLOSE,FAMILY
   }

   class Contact{
    Map<Contact,Nature> list = new Map<>();
   }

   class Case{
    private int id;
   private Contact allContacts;
   }
   class Cluster{
   private Set<Case> clusterCases;
   }

   class Imported extends Case{
    private String origin;
   }

   class Local extends Case{
   }
