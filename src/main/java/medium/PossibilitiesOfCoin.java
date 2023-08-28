package medium;

public class PossibilitiesOfCoin {
    public int possibilities(int n){
        int[] heads = new int[n + 1];
        int[] tails = new int[n + 1];
        heads[0] = 1;
        tails[0] = 1;
        for(int i = 1; i <= n; i++){
            heads[i] = heads[i - 1] + tails[i - 1];
            tails[i] = heads[i - 1];
        }
        return heads[n] + tails[n];
    }
}
