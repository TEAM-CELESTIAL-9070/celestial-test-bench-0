package co.xreos.celestialtestbench0.member.entities;

import co.xreos.celestialtestbench0.member.entities.IMember;

public class KemalUcarkaya implements IMember {
    private String name = "Kemal Ucarkaya";
    private String subTeam = "FRC-Yazılım";
    private String id = "223";
    private long networkId = 0L;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubTeam() {
        return subTeam;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public long getNetworkId() {
        return networkId;
    }
}
