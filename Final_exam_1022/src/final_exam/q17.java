package final_exam;

public class q17 {

    public static class Member {
        private String name;

        public Member(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Club {
        public static void main(String[] args) {
            Member m0 = new Member("alan");
            Member m1 = new Member("mark");
            Member m2 = new Member("tom");
            Member m3 = new Member("jim");

            Member[] members1 = {m0, m1, m2, m3};
            Member[] members2 = new Member[members1.length];

            for (int i = 0; i < members2.length; i++) {
                members2[i] = members1[(i + 1) % members1.length];
            }

            members2[1].setName(members1[0].getName());
            members2[3].setName(members1[2].getName());

            // Printing the names to verify
            System.out.println("members2[1] Name: " + members2[1].getName());
            System.out.println("members2[3] Name: " + members2[3].getName());
            for (int i = 0; i < members2.length; i++) {
                System.out.println("members2[" + i + "] Name: " + members2[i].getName());
            }
        }
    }
}
