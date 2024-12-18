package X;

/* renamed from: X.F4u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34144F4u {
    public static final float A00(Integer num, Integer num2) {
        int intValue;
        if (num != null && num2 != null && (intValue = num2.intValue()) != 0) {
            float intValue2 = num.intValue() / intValue;
            if (intValue2 < 0.75f) {
                return 0.75f;
            }
            if (intValue2 <= 1.7777778f) {
                return intValue2;
            }
            return 1.7777778f;
        }
        return 1.0f;
    }
}
