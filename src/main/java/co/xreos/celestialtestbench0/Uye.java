package co.xreos.celestialtestbench0;

public class Uye implements IMember {
   String Name;
   String SubTeam;
   String Id;
   long NetworkId;
   public String getName(){
       return Name;
   }
   public String SetName(String Name){
       this.Name=Name;
   }

   public String getSubTeam(){
       return SubTeam;
   }
   public String setSubTeam(String SubTeam){
       this.SubTeam=SubTeam;
   }
   public String getId(){
       return Id;
   }
   public String setId(String Id){
       this.Id = Id;
   }
   public long getNetworkId(){
       return NetworkId;
   }
   public long setNetworkId(String NetWorkId){
       this.NetworkId=NetworkId;
   }

}
