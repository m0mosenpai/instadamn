package X;

/* renamed from: X.9wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225039wS {
    public static final Integer A00(int i) {
        if (i >= 0) {
            if (i < 480) {
                return C05F.A00;
            }
            if (i < 900) {
                return C05F.A01;
            }
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12("Height cannot be negative!");
    }
}
