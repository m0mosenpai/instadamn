package X;

/* renamed from: X.5h0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC122655h0 {
    public static long A01(C57y c57y, float f) {
        float B7e;
        C58E A00;
        C58C c58c = C58C.A00;
        if (c57y.B7e() >= 1.03f && (A00 = c58c.A00(c57y.B7e())) != null) {
            B7e = A00.AK5(f);
        } else {
            B7e = f / c57y.B7e();
        }
        return AbstractC118155Vz.A00(B7e, 4294967296L);
    }

    public static float A00(C57y c57y, long j) {
        float A00;
        if (C118135Vx.A01(j) == 4294967296L) {
            C58C c58c = C58C.A00;
            if (c57y.B7e() >= 1.03f) {
                C58E A002 = c58c.A00(c57y.B7e());
                A00 = C118135Vx.A00(j);
                if (A002 != null) {
                    return A002.AK9(A00);
                }
            } else {
                A00 = C118135Vx.A00(j);
            }
            return A00 * c57y.B7e();
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
