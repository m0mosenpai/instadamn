package X;

import java.util.List;

/* renamed from: X.U1q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66149U1q implements InterfaceC43071ya {
    public final W99 A00;
    public final C66138U1f A01;

    public C66149U1q(W99 w99, C66138U1f c66138U1f) {
        this.A00 = w99;
        this.A01 = c66138U1f;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        W99 w99;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            C66138U1f c66138U1f = this.A01;
            Object obj = c59062n7.A03;
            if (c66138U1f.AHA(obj.toString()) && (w99 = this.A00) != null) {
                List list = (List) obj;
                C14360o3.A0B(list, 0);
                C18920wW c18920wW = w99.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_sources_bottomsheet_impression");
                if (A00.isSampled()) {
                    InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
                    W99.A01(A00, w99);
                    A00.AAk("third_party_link_list", list);
                    A00.Cht();
                }
            }
        }
    }
}
