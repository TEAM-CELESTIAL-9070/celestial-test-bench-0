package co.xreos.celestialtestbench0;

import co.xreos.celestialtestbench0.member.entities.IMember;
import co.xreos.celestialtestbench0.member.registry.MemberRegistry;

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
        IMember DenizSelli = new IMember() {
            @Override
            public String getName() {

                return "DenizSelli";
            }

            @Override
            public String getSubTeam() {
                return "CELESTIAL";
            }

            @Override
            public String getId() {
                return "563";
            }

            @Override
            public long getNetworkId() {
                return 0;
            }
        };
    }
}