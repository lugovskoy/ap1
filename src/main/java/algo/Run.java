package algo;

import algo.week1.UF;

public class Run {
    public static void main(String[] args) {
        UF uf = new UF(4);
        uf.union(1,2);

        System.out.println("Hello World!" + uf.connected(2,3 ));
    }
}
