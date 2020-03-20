import java.util.Map;
import java.util.Set;

enum Nature {
   CASUAL, CLOSE, FAMILY
}

class Contact {
   Enum<Nature> nature;
   Case case1;
   Case case2;
}

class Case {
   private int id;
}

class Cluster {
   private String name;
   private Set<Case> clusterCases;
}

class ImportedCase extends Case {
   private String origin;
}

class Local extends Case {
}
