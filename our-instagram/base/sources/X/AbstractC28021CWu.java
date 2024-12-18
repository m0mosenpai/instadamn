package X;

/* renamed from: X.CWu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28021CWu {
    public static final float A00(Integer num, boolean z) {
        int intValue = num.intValue();
        if (!z) {
            switch (intValue) {
                case 1:
                case 3:
                    return 0.05f;
                case 2:
                    return 0.2f;
                default:
                    return 0.1f;
            }
        }
        switch (intValue) {
            case 1:
                return 0.2f;
            case 2:
                return 1.0f;
            case 3:
                return 0.6f;
            default:
                return 0.1f;
        }
    }

    public static boolean A01(Integer num) {
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                return false;
            default:
                return true;
        }
    }
}
