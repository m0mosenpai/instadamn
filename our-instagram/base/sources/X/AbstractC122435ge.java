package X;

/* renamed from: X.5ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122435ge {
    public static final void A00(int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (i <= i2) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A02(i, i2, "minLines ", " must be less than or equal to maxLines "));
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("both minLines ", " and maxLines ", " must be greater than zero", i, i2));
    }
}
