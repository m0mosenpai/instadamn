package X;

/* loaded from: classes4.dex */
public abstract class A03 {
    public static final float A00(C55U c55u, C1816283r c1816283r, EnumC171727l2 enumC171727l2, int i, int i2, int i3, int i4, boolean z) {
        if (c55u instanceof C81V) {
            if (enumC171727l2 != EnumC171727l2.A04) {
                return 1.0f;
            }
            return 0.5f;
        }
        if (c55u != C208509Kk.A00 || c1816283r == null) {
            return 1.0f;
        }
        int ordinal = enumC171727l2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                float f = i2;
                float f2 = i;
                float A0m = c1816283r.A03.A0m();
                if (A0m >= 1.0f / (f2 / (0.5f * f))) {
                    return 1.0f;
                }
                if (z) {
                    return A0m * Math.min((f2 / f) / (i3 / i4), 1.0f);
                }
                return A0m;
            }
            throw B4Z.A00();
        }
        float f3 = i;
        float A0m2 = (0.5f * f3) / c1816283r.A03.A0m();
        return Math.min(A0m2 / i2, (A0m2 * (i3 / i4)) / f3);
    }
}
