public class track {
   private String Tracks ;

    public enum kinds {
        Запутанные,
        Куриные ;
    }
   public String getTracks() {
       kinds[] all = kinds.values();
       Tracks = "";
       for (kinds kinds : all) {
           Tracks += kinds + " ";
       }
       return Tracks;
   }
}
