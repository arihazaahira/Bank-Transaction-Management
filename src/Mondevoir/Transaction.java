package Mondevoir;
import java.time.LocalDateTime;
public class Transaction {
   private Typetransaction typeT;
   private String ref;
   private Compte[] mescomptes = new Compte[2]; 
   private LocalDateTime timestamp;
   public Transaction(Typetransaction typeT, String ref, Compte compteSRC, Compte compteDST) {
       this.typeT = typeT;
       this.ref = ref;
       this.mescomptes[0] = compteSRC;
       this.mescomptes[1] = compteDST;
       this.timestamp = LocalDateTime.now(); 
   }
   public Typetransaction  getTypeT() {
   	return this.typeT;
   }
   public String getref() {
	   return this.ref;
   }
}
