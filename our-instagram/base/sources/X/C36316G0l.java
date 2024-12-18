package X;

import java.util.Map;

/* renamed from: X.G0l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36316G0l implements InterfaceC43071ya {
    public final GXH A00;
    public final G05 A01;
    public final FJI A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        double d;
        Long l;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        long B0m = interfaceC57162jr.B0m(c59062n7);
        float CGk = interfaceC57162jr.CGk(c59062n7);
        C32098E8w c32098E8w = (C32098E8w) c59062n7.A03;
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                FJI fji = this.A02;
                C14360o3.A0A(c32098E8w);
                double d2 = B0m;
                C14360o3.A0B(c32098E8w, 0);
                Map map = fji.A01;
                String str = c32098E8w.A05;
                Number number = (Number) map.get(str);
                if (number != null && number.doubleValue() >= 0.8999999761581421d && d2 >= 250.0d) {
                    G05 g05 = fji.A00;
                    int i = c32098E8w.A00;
                    String str2 = c32098E8w.A04;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C14360o3.A0B(str, 2);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(g05.A0G, "direct_reshare_meta_ai_suggested_prompt_seen_state");
                    String str3 = g05.A01;
                    Long l2 = null;
                    if (str3 != null) {
                        l = AbstractC166997dE.A0j(str3);
                    } else {
                        l = null;
                    }
                    String str4 = g05.A03;
                    if (str4 != null) {
                        l2 = AbstractC166997dE.A0j(str4);
                    }
                    if (A0f.isSampled()) {
                        G05.A02(A0f, g05, l, l2);
                        A0f.AAP("suggested_prompt_id", str2);
                        A0f.AAP("suggested_prompt_text", str);
                        A0f.AAP("suggested_prompt_position", String.valueOf(i));
                        A0f.A8I("dwell_time_s", Double.valueOf(d2));
                        AbstractC31176DnK.A1I(A0f);
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
            Map map2 = this.A02.A01;
            String str5 = c32098E8w.A05;
            Number number2 = (Number) map2.get(str5);
            if (number2 != null) {
                d = number2.doubleValue();
            } else {
                d = 0.0d;
            }
            map2.put(str5, Double.valueOf(Math.max(d3, d)));
            return;
        }
        C14360o3.A0A(c32098E8w);
        A00(c32098E8w);
    }

    private final void A00(C32098E8w c32098E8w) {
        InterfaceC02590Ai A0f;
        Long l;
        String valueOf;
        Long l2;
        GXH gxh = this.A00;
        String str = c32098E8w.A05;
        if (gxh.AHA(str)) {
            int i = c32098E8w.A00;
            if (i == 0) {
                G05 g05 = this.A01;
                A0f = AbstractC166987dD.A0f(g05.A0G, "direct_reshare_meta_ai_suggested_prompt_impression");
                String str2 = g05.A01;
                Long l3 = null;
                if (str2 != null) {
                    l2 = AbstractC166997dE.A0j(str2);
                } else {
                    l2 = null;
                }
                String str3 = g05.A03;
                if (str3 != null) {
                    l3 = AbstractC166997dE.A0j(str3);
                }
                if (A0f.isSampled()) {
                    G05.A02(A0f, g05, l2, l3);
                    valueOf = "0";
                } else {
                    return;
                }
            } else {
                G05 g052 = this.A01;
                String str4 = c32098E8w.A04;
                if (str4 == null) {
                    str4 = "";
                }
                C14360o3.A0B(str, 2);
                A0f = AbstractC166987dD.A0f(g052.A0G, "direct_reshare_meta_ai_suggested_prompt_impression");
                String str5 = g052.A01;
                Long l4 = null;
                if (str5 != null) {
                    l = AbstractC166997dE.A0j(str5);
                } else {
                    l = null;
                }
                String str6 = g052.A03;
                if (str6 != null) {
                    l4 = AbstractC166997dE.A0j(str6);
                }
                if (!A0f.isSampled()) {
                    return;
                }
                G05.A02(A0f, g052, l, l4);
                A0f.AAP("suggested_prompt_id", str4);
                A0f.AAP("suggested_prompt_text", str);
                valueOf = String.valueOf(i);
            }
            AbstractC25232BEp.A1L(A0f, "suggested_prompt_position", valueOf);
        }
    }

    public C36316G0l(GXH gxh, G05 g05, FJI fji) {
        this.A01 = g05;
        this.A00 = gxh;
        this.A02 = fji;
    }
}
