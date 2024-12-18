package X;

/* renamed from: X.A0x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22727A0x {
    public static final float A00(C38321qM c38321qM) {
        C96444Vc A1U;
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5g()) {
            A1U = c38321qM.A1U();
            if (A1U == null || !A1U.A02) {
                return 1.0f;
            }
        } else if (c38321qM.A5P() && c38321qM.A1U() != null) {
            A1U = c38321qM.A1U();
            if (A1U == null) {
                return 1.0f;
            }
        } else {
            return c38321qM.A0m();
        }
        return A1U.A01 / A1U.A00;
    }
}
