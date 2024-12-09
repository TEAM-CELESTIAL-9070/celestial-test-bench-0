package co.xreos.celestialtestbench0.member.entities;

public class YilmazYasyerli implements IMember{
    @Override
    public String getName() {
        return "Yilmaz Yasyerli";
    }

    @Override
    public String getId() {
        return "632";
    }

    @Override
    public String getSubTeam() {
        return "CELESTIAL";
    }

    @Override
    public long getNetworkId(){
        return 0;
    }
}
