package X;

/* renamed from: X.SbD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63038SbD {
    public static final void A00(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw AbstractC25229BEm.A0l("index: ", ", size: ", i, i2);
        }
    }

    public static final void A01(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw AbstractC25229BEm.A0l("index: ", ", size: ", i, i2);
        }
    }

    public static final void A02(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            } else {
                throw AbstractC166987dD.A12(AnonymousClass001.A02(i, i2, "fromIndex: ", AbstractC111324zv.A00(3332)));
            }
        }
        throw AbstractC58318PtA.A0a(AnonymousClass001.A0p("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
    }
}
