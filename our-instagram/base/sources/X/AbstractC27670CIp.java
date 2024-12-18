package X;

/* renamed from: X.CIp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27670CIp {
    public static final Integer A00(int i) {
        int i2;
        for (Integer num : C05F.A00(6)) {
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
                case 5:
                    i2 = 5;
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
