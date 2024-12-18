package X;

/* renamed from: X.2bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52892bV {
    public static final Integer A00(int i) {
        if (i >= 0) {
            if (i < 600) {
                return C05F.A00;
            }
            if (i < 840) {
                return C05F.A01;
            }
            return C05F.A0C;
        }
        throw new IllegalArgumentException("Width cannot be negative!");
    }
}
