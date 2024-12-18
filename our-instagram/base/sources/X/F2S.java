package X;

/* loaded from: classes6.dex */
public abstract class F2S {
    public static final Integer A00(long j) {
        long j2;
        for (Integer num : C05F.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    j2 = 1;
                    break;
                case 2:
                    j2 = 2;
                    break;
                case 3:
                    j2 = 3;
                    break;
                default:
                    j2 = 0;
                    break;
            }
            if (j2 == j) {
                return num;
            }
        }
        return C05F.A00;
    }
}
