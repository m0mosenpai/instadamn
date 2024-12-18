package X;

/* loaded from: classes6.dex */
public abstract class FDM {
    public static final Integer A00(int i) {
        int i2;
        for (Integer num : C05F.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        return C05F.A0N;
    }
}
