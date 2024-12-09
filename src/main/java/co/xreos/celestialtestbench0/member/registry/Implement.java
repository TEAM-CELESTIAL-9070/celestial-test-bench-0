package co.xreos.celestialtestbench0.member.registry;

import co.xreos.celestialtestbench0.member.entities.IMember;

import static co.xreos.celestialtestbench0.Runner.registry;

public class Implement implements IMember {
   @Override
   public String getName() {
      return "SevayYavas";
   }

   @Override
   public String getSubTeam() {
      return "CELESTIAL";
   }

   @Override
   public String getId() {
      return "679";
   }

   @Override
   public long getNetworkId() {
      return 0;
   }
}
