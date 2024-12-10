package co.xreos.celestialtestbench0.member.entities;

public class ElifnazCingil implements IMember{
        private String name = "Elifnaz Cingil";
        private String id = "elifNa"; // Use your student ID or GitHub username

        @Override
        public String getName() {
            return name;
        }

    @Override
    public String getSubTeam() {
        return "";
    }

    @Override
        public String getId() {
            return id;
        }

    @Override
    public long getNetworkId() {
        return 0;
    }

}
