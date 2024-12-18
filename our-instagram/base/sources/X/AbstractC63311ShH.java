package X;

/* renamed from: X.ShH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63311ShH {
    public static final int A01(int i, boolean z) {
        return (i * 31) + AbstractC58322PtE.A02(z ? 1 : 0);
    }

    public static final void A04(Object obj, String str) {
        if (obj != null) {
        } else {
            throw AbstractC166987dD.A15(AnonymousClass001.A0R(str, " is null"));
        }
    }

    public static final int A00(double d, int i) {
        return (i * 31) + AbstractC25228BEl.A03(Double.doubleToLongBits(d));
    }

    public static int A02(Object obj) {
        return A03(obj);
    }

    public static final int A03(Object obj) {
        return AbstractC25235BEs.A06(obj) + 31;
    }
}
