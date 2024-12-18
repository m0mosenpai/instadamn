package X;

import java.util.Map;

/* renamed from: X.U1o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66147U1o implements InterfaceC43071ya {
    public final W99 A00;
    public final C66139U1g A01;
    public final C66138U1f A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        double d;
        W99 w99;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        long B0m = interfaceC57162jr.B0m(c59062n7);
        float CGk = interfaceC57162jr.CGk(c59062n7);
        C32098E8w c32098E8w = (C32098E8w) c59062n7.A03;
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                C66139U1g c66139U1g = this.A01;
                C14360o3.A0A(c32098E8w);
                double d2 = B0m;
                C14360o3.A0B(c32098E8w, 0);
                Map map = c66139U1g.A01;
                String str = c32098E8w.A05;
                Number number = (Number) map.get(str);
                if (number != null && number.doubleValue() >= 0.8999999761581421d && d2 >= 250.0d && (w99 = c66139U1g.A00) != null) {
                    int i = c32098E8w.A00;
                    String str2 = c32098E8w.A07;
                    String str3 = c32098E8w.A04;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C14360o3.A0B(str2, A1R ? 1 : 0);
                    C14360o3.A0B(str, 2);
                    C18920wW c18920wW = w99.A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_prompt_seen");
                    if (A00.isSampled()) {
                        InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
                        W99.A01(A00, w99);
                        A00.A9K("prompt_index", Long.valueOf(i));
                        A00.AAP("prompt_source", str2);
                        A00.AAP("prompt_text", str);
                        A00.AAP("prompt_id", str3);
                        A00.A8I(AbstractC111324zv.A00(207), Double.valueOf(d2));
                        A00.Cht();
                    }
                }
                map.remove(str);
                return;
            }
            C14360o3.A0A(c32098E8w);
            A00(c32098E8w);
            if (c32098E8w.A00 == 0) {
                return;
            }
            double d3 = CGk;
            Map map2 = this.A01.A01;
            String str4 = c32098E8w.A05;
            Number number2 = (Number) map2.get(str4);
            if (number2 != null) {
                d = number2.doubleValue();
            } else {
                d = 0.0d;
            }
            map2.put(str4, Double.valueOf(Math.max(d3, d)));
            return;
        }
        C14360o3.A0A(c32098E8w);
        A00(c32098E8w);
    }

    private final void A00(C32098E8w c32098E8w) {
        String str;
        InterfaceC02590Ai A00;
        String str2;
        C66138U1f c66138U1f = this.A02;
        String str3 = c32098E8w.A05;
        if (c66138U1f.AHA(str3)) {
            int i = c32098E8w.A00;
            if (i == 0) {
                W99 w99 = this.A00;
                if (w99 != null) {
                    C18920wW c18920wW = w99.A01;
                    A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_donut_impression");
                    if (A00.isSampled()) {
                        InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
                        str = w99.A03.A00();
                        str2 = "text_response_id";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                W99 w992 = this.A00;
                if (w992 == null) {
                    return;
                }
                String str4 = c32098E8w.A07;
                str = c32098E8w.A04;
                if (str == null) {
                    str = "";
                }
                AbstractC167017dG.A1P(str4, str3);
                C18920wW c18920wW2 = w992.A01;
                A00 = c18920wW2.A00(c18920wW2.A00, "ig_search_meta_ai_hcm_prompt_impression");
                if (!A00.isSampled()) {
                    return;
                }
                InterfaceC72022XFk.A00(A00, w992, W99.A00(A00, w992));
                W99.A01(A00, w992);
                A00.A9K("prompt_index", Long.valueOf(i));
                A00.AAP("prompt_source", str4);
                A00.AAP("prompt_text", str3);
                str2 = "prompt_id";
            }
            A00.AAP(str2, str);
            A00.Cht();
        }
    }

    public C66147U1o(W99 w99, C66139U1g c66139U1g, C66138U1f c66138U1f) {
        this.A00 = w99;
        this.A02 = c66138U1f;
        this.A01 = c66139U1g;
    }
}
