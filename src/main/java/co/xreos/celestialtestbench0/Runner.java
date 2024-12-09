package co.xreos.celestialtestbench0;

import co.xreos.celestialtestbench0.member.entities.IMember;
import co.xreos.celestialtestbench0.member.registry.MemberRegistry;

import java.util.List;



class Member implements IMember {
    public String getName() {return "Github username: btnyaren \nClass name: Btnyaren";};
    public String getSubTeam() {return "";};
    public String getId() {return "746";};
    public long getNetworkId() {return 8231L;};
}


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

        Member member = new Member();

        Runner.registry.registerMember(member);
    }
}
