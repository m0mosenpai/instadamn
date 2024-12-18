package X;

/* renamed from: X.NzK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54300NzK {
    public static final Integer A00(String str) {
        if (str != null) {
            try {
                if (str.equals("OFF")) {
                    return C05F.A00;
                }
                if (str.equals("PAID_BALANCE")) {
                    return C05F.A01;
                }
                if (str.equals("ZERO_BALANCE")) {
                    return C05F.A0C;
                }
                throw AbstractC166987dD.A12(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
