package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.Ahx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23904Ahx implements InterfaceC25189BCm {
    public final /* synthetic */ C8TS A00;
    public final /* synthetic */ C191038cz A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    @Override // X.InterfaceC25189BCm
    public final void Cz4(AGv aGv, C195868lW c195868lW) {
    }

    public C23904Ahx(C8TS c8ts, C191038cz c191038cz, List list, List list2, List list3) {
        this.A00 = c8ts;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = c191038cz;
    }

    @Override // X.InterfaceC25189BCm
    public final void Cz2(AGv aGv, C183978Ee c183978Ee) {
        C8TS c8ts = this.A00;
        C183688Ct c183688Ct = c8ts.A03;
        c183688Ct.A0O = c183978Ee;
        C81M A01 = aGv.A01();
        aGv.A0C = true;
        C81M A012 = aGv.A01();
        C198308pf c198308pf = null;
        for (AA0 aa0 : this.A03) {
            C195868lW c195868lW = aa0.A04;
            if (c195868lW != null) {
                c195868lW.A0U = c183978Ee.A0I;
                Bitmap bitmap = aa0.A01;
                String str = aa0.A05;
                if (bitmap != null) {
                    c198308pf = new C198308pf(bitmap, c195868lW, str);
                } else {
                    c198308pf = new C198308pf(c195868lW, str);
                }
                this.A04.add(A012);
            } else {
                C183978Ee c183978Ee2 = aa0.A03;
                if (c183978Ee2 != null) {
                    c198308pf = new C198308pf(aa0.A02, c183978Ee2, aa0.A05, false);
                } else {
                    Bitmap bitmap2 = aa0.A02;
                    if (bitmap2 != null && aa0.A00 != null) {
                        c198308pf = new C198308pf(bitmap2, c183978Ee, aa0.A05, false);
                    } else if (aa0.A00 != null) {
                        c198308pf = new C198308pf(null, c183978Ee, aa0.A05, false);
                    } else if (c198308pf == null) {
                        c183688Ct.A02 = aa0.A00;
                    }
                }
                this.A04.add(A01);
            }
            this.A02.add(c198308pf);
            c183688Ct.A02 = aa0.A00;
        }
        c183688Ct.A0B = A01;
        c183688Ct.A0C = A012;
        c183688Ct.A09 = this.A01;
        c8ts.A05.A02.A08(C05F.A00);
        c8ts.A06.E4u(new C187708Tn(this.A02, this.A04));
    }
}
