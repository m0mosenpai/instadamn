package X;

import java.util.List;

/* renamed from: X.VtT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69683VtT {
    public final List A00;
    public final XG2[] A01;

    public final void A01(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        boolean z;
        int i = 0;
        while (true) {
            XG2[] xg2Arr = this.A01;
            if (i < xg2Arr.length) {
                w4q.A01();
                W4Q.A00(w4q);
                XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 3);
                C70130W5r c70130W5r = (C70130W5r) this.A00.get(i);
                String str = c70130W5r.A0Y;
                if (!"application/cea-608".equals(str)) {
                    z = false;
                    if (!"application/cea-708".equals(str)) {
                        WDn.A03(z, AnonymousClass001.A0R("Invalid closed caption MIME type provided: ", str));
                        C70116W4o c70116W4o = new C70116W4o();
                        W4Q.A00(w4q);
                        c70116W4o.A0T = w4q.A01;
                        c70116W4o.A00(str);
                        c70116W4o.A0H = c70130W5r.A0J;
                        c70116W4o.A0V = c70130W5r.A0X;
                        c70116W4o.A02 = c70130W5r.A03;
                        c70116W4o.A0X = c70130W5r.A0Z;
                        XG2.A00(c70116W4o, F87);
                        xg2Arr[i] = F87;
                        i++;
                    }
                }
                z = true;
                WDn.A03(z, AnonymousClass001.A0R("Invalid closed caption MIME type provided: ", str));
                C70116W4o c70116W4o2 = new C70116W4o();
                W4Q.A00(w4q);
                c70116W4o2.A0T = w4q.A01;
                c70116W4o2.A00(str);
                c70116W4o2.A0H = c70130W5r.A0J;
                c70116W4o2.A0V = c70130W5r.A0X;
                c70116W4o2.A02 = c70130W5r.A03;
                c70116W4o2.A0X = c70130W5r.A0Z;
                XG2.A00(c70116W4o2, F87);
                xg2Arr[i] = F87;
                i++;
            } else {
                return;
            }
        }
    }

    public final void A00(WFa wFa, long j) {
        if (wFa.A00 - wFa.A01 >= 9) {
            int A01 = wFa.A01();
            int A012 = wFa.A01();
            int A05 = wFa.A05();
            if (A01 == 434 && A012 == 1195456820 && A05 == 3) {
                AbstractC69806Vvs.A01(wFa, this.A01, j);
            }
        }
    }

    public C69683VtT(List list) {
        this.A00 = list;
        this.A01 = new XG2[list.size()];
    }
}
