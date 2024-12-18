package X;

/* loaded from: classes5.dex */
public abstract class CHP {
    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return 5;
            }
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue == 4) {
                        return 3;
                    }
                    throw B4Z.A00();
                }
                return 2;
            }
            return 1;
        }
        return 4;
    }
}
