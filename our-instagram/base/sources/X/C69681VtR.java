package X;

/* renamed from: X.VtR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69681VtR {
    public final /* synthetic */ AbstractC67878V0j A00;

    public final void A01(String str, Integer num) {
        String str2;
        C14360o3.A0B(str, 0);
        W99 w99 = this.A00.A0C;
        if (w99 == null) {
            C14360o3.A0F("serpMetaAiHcmLogger");
            throw C00O.createAndThrow();
        }
        C18920wW c18920wW = w99.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_third_party_source_tap");
        if (A00.isSampled()) {
            InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
            W99.A01(A00, w99);
            A00.AAP("third_party_link", str);
            if (num.intValue() != 0) {
                str2 = "sources";
            } else {
                str2 = "card";
            }
            A00.AAP(AbstractC43591JPw.A00(216), str2);
            A00.Cht();
        }
    }

    public C69681VtR(AbstractC67878V0j abstractC67878V0j) {
        this.A00 = abstractC67878V0j;
    }

    public final void A00(Integer num) {
        String str;
        AbstractC67878V0j abstractC67878V0j = this.A00;
        W99 w99 = abstractC67878V0j.A0C;
        if (w99 == null) {
            C14360o3.A0F("serpMetaAiHcmLogger");
            throw C00O.createAndThrow();
        }
        String A03 = abstractC67878V0j.A07().A03();
        C18920wW c18920wW = w99.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_text_tap");
        if (A00.isSampled()) {
            A00.AAP("nav_chain", W99.A00(A00, w99));
            A00.AAP("search_session_id", w99.A05);
            A00.AAP("serp_session_id", w99.A06);
            A00.AAP("rank_token", A03);
            A00.AAP("query_text", w99.A04);
            W99.A01(A00, w99);
            switch (num.intValue()) {
                case 0:
                    str = "shrink";
                    break;
                case 1:
                    str = "expand";
                    break;
                default:
                    str = "open_thread";
                    break;
            }
            A00.AAP("tap_behavior", str);
            A00.Cht();
        }
    }
}
