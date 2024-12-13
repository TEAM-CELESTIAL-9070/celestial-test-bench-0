package co.xreos.celestialtestbench0;

import co.xreos.celestialtestbench0.member.entities.IMember;
import co.xreos.celestialtestbench0.member.registry.MemberRegistry;
import co.xreos.celestialtestbench0.member.registry.YasarKaganTasdemir;
import co.xreos.celestialtestbench0.member.registry.SevayYavas;

import java.util.List;

public class Runner {
    public static MemberRegistry registry = new MemberRegistry();

    public static void main(String[] args) {
        System.out.println("Hello, Celestial Testbench 0!");

        registerMembers();

        List<IMember> members = registry.getMembers();
        if(members.isEmpty()) throw new RuntimeException("No members registered!");

        System.out.println("Registered " + members.size() + " members: ");
        for (IMember member : members) {
            System.out.println(" - " + member.getName() + " (" + member.getSubTeam() + ")");
        }
    }

    private static void registerMembers() {
        // Register yourself here...
IMember AhmetKeremKuru = new IMember() {
    @Override
    public String getName() {
        return "First Name: Ahmet Kerem " +
                "Last Name: Kuru" +
                "Class Name: AhmetKeremKuru";
    }

    @Override
    public String getSubTeam() {
        return "";
    }

    @Override
    public String getId() {
        return "AKK-wq";
    }

    @Override
    public long getNetworkId() {
        return 0;
    }
};

registry.registerMember(AhmetKeremKuru);
        YasarKaganTasdemir YasarKaganTasdemir = new YasarKaganTasdemir();
        registry.registerMember(YasarKaganTasdemir);
        SevayYavas SevayYavas = new SevayYavas();
        registry.registerMember(SevayYavas);
    }


}
