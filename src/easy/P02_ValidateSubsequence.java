package easy;

public class P02_ValidateSubsequence {
    public static void main(String[] args) {
        int[] seq = new int[]{6, 1, 22, 25, 5, -1, 8, 10};
        int[] sub = new int[]{1, 6, -1, 10};
        ValidateSubsequenceSolution solution = new ValidateSubsequenceSolution();
        System.out.println(solution.isSubSeq(seq, sub));
    }
}

class ValidateSubsequenceSolution {
    boolean isSubSeq(int[] seq, int[] sub) {
        int j = 0;
        for (int i = 0; i < seq.length && j < sub.length;) {
            if (sub[j] == seq[i]) {
                j++;
                i = 0;
            } else {
                i++;
            }
        }
        return j == sub.length;
    }
}

class ValidateSubsequenceSolution2 {
    boolean isSubSeq(int[] seq, int[] sub) {
        int seqIdx = 0;
        int subIdx = 0;
        while (seqIdx < seq.length && subIdx < sub.length) {
            if (sub[subIdx] == seq[seqIdx]) {
                subIdx++;
                seqIdx = 0;
            } else {
                seqIdx++;
            }
        }
        return subIdx == sub.length;
    }
}

class ValidateSubsequenceSolution4 {
    boolean isSubSeq(int[] seq, int[] sub) {
        int j = 0;
        for (var val : seq) {
            if (j == sub.length) break;
            if (sub[j] == val) {
                j++;
            }
        }
        return j == seq.length;
    }
}