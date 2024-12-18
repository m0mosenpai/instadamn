package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168127f7 {
    public C169917i6 A00;
    public C169987iD A01;

    public final void A01() {
        String str;
        C169917i6 c169917i6 = this.A00;
        if (c169917i6 != null) {
            synchronized (c169917i6) {
                AbstractC169857hz abstractC169857hz = c169917i6.A02;
                if (abstractC169857hz != null) {
                    str = abstractC169857hz.A03;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                C169917i6.A04();
                C22861A6h A01 = C169917i6.A01(c169917i6, str);
                int i = A01.A01.A00;
                if (0 < i) {
                    C169947i9 c169947i9 = c169917i6.A09;
                    c169947i9.A00.EJ6(A01.A00, 0);
                } else {
                    C2YE.A00("SectionTree:OutOfBoundsRequestFocus", C05F.A01, AnonymousClass001.A02(0, i, "You are trying to request focus with offset on an index that is out of bounds: requested ", " , total "));
                }
            }
        }
    }

    public final void A03(Integer num, Object obj) {
        C14360o3.A0B(obj, 0);
        C169917i6 c169917i6 = this.A00;
        if (c169917i6 != null) {
            C169917i6.A04();
            c169917i6.A09.A00.EJM(num, obj, 0);
        }
    }

    public final RecyclerView A00() {
        C2Z8 c2z8;
        C169987iD c169987iD = this.A01;
        if (c169987iD != null && (c2z8 = c169987iD.A01) != null) {
            return c2z8.A04;
        }
        return null;
    }

    public final void A02(Integer num, int i, int i2) {
        String str;
        C169917i6 c169917i6 = this.A00;
        if (c169917i6 != null) {
            synchronized (c169917i6) {
                AbstractC169857hz abstractC169857hz = c169917i6.A02;
                if (abstractC169857hz != null) {
                    str = abstractC169857hz.A03;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                C169917i6.A04();
                C22861A6h A01 = C169917i6.A01(c169917i6, str);
                int i3 = A01.A01.A00;
                if (i < i3 && i >= 0) {
                    C169947i9 c169947i9 = c169917i6.A09;
                    c169947i9.A00.EJL(num, A01.A00 + i, i2);
                } else {
                    C2YE.A00("SectionTree:OutOfBoundsRequestFocus", C05F.A01, AnonymousClass001.A02(i, i3, "You are trying to request focus with offset on an index that is out of bounds: requested ", " , total "));
                }
            }
        }
    }
}
