package algo.week1;

public class UF {
    private int[] idsArray;

    public UF(int N) {
        idsArray = new int[N];
        for (int i = 0; i < N; ++i) {
            idsArray[i] = i;
        }
    }

    public void union(int a, int b) {
        int aId = idsArray[a];
        int bId = idsArray[b];

        if (aId == bId)
            return;

        for (int i = 0; i < idsArray.length; ++i) {
            if (idsArray[i] == aId) {
                idsArray[i] = bId;
            }
        }
    }

    public boolean connected(int a, int b) {
        return idsArray[a] == idsArray[b];
    }
}
