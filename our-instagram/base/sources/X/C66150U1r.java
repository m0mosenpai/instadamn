package X;

/* renamed from: X.U1r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66150U1r implements InterfaceC43071ya {
    public final W99 A00;
    public final C66146U1n A01;
    public final C66138U1f A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        double B0m = interfaceC57162jr.B0m(c59062n7);
        double CGk = interfaceC57162jr.CGk(c59062n7);
        UPQ upq = (UPQ) c59062n7.A03;
        String str = upq.A02.A01;
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                this.A01.A00 += B0m;
                return;
            } else {
                A00(upq, str);
                C66146U1n c66146U1n = this.A01;
                c66146U1n.A01 = Math.max(c66146U1n.A01, CGk);
                return;
            }
        }
        A00(upq, str);
    }

    private final void A00(UPQ upq, String str) {
        W99 w99;
        InterfaceC02590Ai A00;
        OHQ ohq;
        String str2;
        String str3;
        C50526MSf c50526MSf = upq.A00;
        if (c50526MSf.A01 && this.A02.AHA(AnonymousClass001.A0R(str, "_startStream"))) {
            W99 w992 = this.A00;
            if (w992 != null) {
                C18920wW c18920wW = w992.A01;
                A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_text_stream_start_impression");
                if (A00.isSampled()) {
                    InterfaceC72022XFk.A00(A00, w992, W99.A00(A00, w992));
                    ohq = w992.A03;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (c50526MSf.A00 && this.A02.AHA(AnonymousClass001.A0R(str, "_endStream"))) {
                W99 w993 = this.A00;
                if (w993 == null) {
                    return;
                }
                C38686GzR c38686GzR = upq.A01;
                if (c38686GzR == null || (str2 = c38686GzR.A02) == null) {
                    str2 = "";
                }
                C18920wW c18920wW2 = w993.A01;
                A00 = c18920wW2.A00(c18920wW2.A00, "ig_search_meta_ai_hcm_text_stream_end_impression");
                if (!A00.isSampled()) {
                    return;
                }
                InterfaceC72022XFk.A00(A00, w993, W99.A00(A00, w993));
                W99.A01(A00, w993);
                str3 = "third_party_link";
                A00.AAP(str3, str2);
                A00.Cht();
            }
            if (!AbstractC001900j.A0T(upq.A03) || !this.A02.AHA(AnonymousClass001.A0R(str, "_shimmer")) || (w99 = this.A00) == null) {
                return;
            }
            C18920wW c18920wW3 = w99.A01;
            A00 = c18920wW3.A00(c18920wW3.A00, "ig_search_meta_ai_hcm_shimmer_impression");
            if (!A00.isSampled()) {
                return;
            }
            InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
            ohq = w99.A03;
        }
        str2 = ohq.A00();
        str3 = "text_response_id";
        A00.AAP(str3, str2);
        A00.Cht();
    }

    public C66150U1r(W99 w99, C66146U1n c66146U1n, C66138U1f c66138U1f) {
        this.A00 = w99;
        this.A02 = c66138U1f;
        this.A01 = c66146U1n;
    }
}
