package X;

/* loaded from: classes11.dex */
public final class WEE {
    public static final WEE A00 = new Object();

    public static final C69329Vlb A01(C102884kP c102884kP) {
        C102884kP A08 = c102884kP.A08(42);
        if (A08 != null) {
            C102884kP A082 = c102884kP.A08(41);
            if (A082 != null) {
                return new C69329Vlb(A00(A08.A02(35, 0.0f)), A00(A08.A02(36, 0.0f)), A00(A082.A02(35, 0.0f)), A00(A082.A02(36, 0.0f)));
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final float A00(float f) {
        float abs = Math.abs(f);
        if (abs >= 0.0f && abs <= 1.0f) {
            return f;
        }
        AbstractC25241Le.A02("ShowreelAnimatedGradientDrawable", "Gradient line coordinate values must range from 0 to 1");
        if (abs >= 0.0f) {
            return 1.0f;
        }
        return 0.0f;
    }
}
