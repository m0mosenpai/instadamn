package X;

/* renamed from: X.2Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51442Xr {
    public static final void A00(C005101q c005101q, C005101q c005101q2, int i) {
        C14360o3.A0B(c005101q, 1);
        if (c005101q2 != null && AbstractC005201r.A00(c005101q2, i) != null) {
            c005101q2.A06(i);
        } else {
            c005101q.A06(i);
        }
    }

    public static final void A02(C005101q c005101q, C005101q c005101q2, int i, int i2) {
        Object A00;
        C14360o3.A0B(c005101q, 2);
        if (c005101q2 != null && AbstractC005201r.A00(c005101q2, i) != null) {
            A00 = AbstractC005201r.A00(c005101q2, i);
            c005101q2.A06(i);
        } else {
            A00 = AbstractC005201r.A00(c005101q, i);
            c005101q.A06(i);
        }
        if (A00 != null) {
            c005101q.A07(i2, A00);
        }
    }

    public static final void A01(C005101q c005101q, C005101q c005101q2, int i) {
        Object A00;
        if (c005101q != null && c005101q2 != null && (A00 = AbstractC005201r.A00(c005101q, i)) != null) {
            c005101q2.A07(i, A00);
        }
    }
}
