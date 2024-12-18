package X;

import java.util.List;

/* renamed from: X.1tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40041tV {
    public static final C40051tW A0C = new Object();
    public C84923qg A00;
    public C40061tX A01;
    public C40061tX A02;
    public C40061tX A03;
    public C40061tX A04;
    public String A07;
    public String A08;
    public boolean A09;
    public C40061tX A05 = new C40061tX();
    public C40061tX A06 = new C40061tX();
    public final C40061tX A0B = new C40061tX();
    public final C40061tX A0A = new C40061tX();

    public final void A01() {
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public final C40061tX A00(C84923qg c84923qg) {
        C40061tX c40061tX = this.A04;
        if (c40061tX == null) {
            C40061tX c40061tX2 = this.A06;
            c40061tX = new C40061tX();
            if (c84923qg != null && c84923qg.A06 == EnumC84933qh.A09) {
                c40061tX.A02(c84923qg);
            }
            for (C84923qg c84923qg2 : c40061tX2.A00) {
                if (c84923qg2.A06 == EnumC84933qh.A09) {
                    c40061tX.A02(c84923qg2);
                }
            }
            this.A04 = c40061tX;
        }
        return c40061tX;
    }

    public final void A02(C38321qM c38321qM, List list, List list2) {
        A01();
        if (list != null) {
            C40051tW.A05(c38321qM, list);
            this.A05.A04(list);
            C40051tW.A02(this.A05);
        }
        if (list2 != null) {
            C40051tW.A05(c38321qM, list2);
            this.A06.A04(list2);
            C40051tW.A02(this.A06);
        }
    }
}
