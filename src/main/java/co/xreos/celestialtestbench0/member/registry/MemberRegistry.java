package co.xreos.celestialtestbench0.member.registry;

import co.xreos.celestialtestbench0.member.entities.IMember;

import java.util.ArrayList;
import java.util.List;

public class MemberRegistry {
    private final List<IMember> members = new ArrayList<>();

    public MemberRegistry() {

    }

    public void registerMember(IMember member) {
        System.out.println("Registering member: " + member.getName());
        members.add(member);
    }

    public List<IMember> getMembers() {
        return members;
    }
}
