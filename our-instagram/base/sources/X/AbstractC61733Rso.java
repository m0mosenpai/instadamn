package X;

/* renamed from: X.Rso, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61733Rso {
    public static final Integer A00(int i) {
        int i2;
        for (Integer num : C05F.A00(5)) {
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
                case 4:
                    i2 = 4;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        return C05F.A00;
    }
}
