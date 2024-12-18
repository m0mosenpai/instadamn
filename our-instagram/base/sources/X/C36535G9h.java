package X;

import android.view.View;
import java.util.List;

/* renamed from: X.G9h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36535G9h implements GZF {
    public final /* synthetic */ C38686GzR A00;
    public final /* synthetic */ C31993E3v A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.GZF
    public final void EDy(View view, C32098E8w c32098E8w) {
    }

    public C36535G9h(C38686GzR c38686GzR, C31993E3v c31993E3v, String str, String str2, String str3) {
        this.A01 = c31993E3v;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c38686GzR;
        this.A04 = str3;
    }

    @Override // X.GZF
    public final void DcC(C32098E8w c32098E8w) {
        String str;
        boolean z;
        String str2;
        EnumC33521Eru enumC33521Eru;
        int i = c32098E8w.A00;
        if (i != 0) {
            str = c32098E8w.A05;
            z = false;
        } else {
            str = null;
            z = true;
        }
        C31993E3v c31993E3v = this.A01;
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        FG0 fg0 = c31993E3v.A09;
        long j = i;
        String str3 = this.A03;
        String str4 = this.A02;
        C38686GzR c38686GzR = this.A00;
        String str5 = this.A04;
        C36010Fv8 c36010Fv8 = fg0.A00;
        EY2 ey2 = c36010Fv8.A02.A01;
        if (ey2 != null) {
            C36303Fzy c36303Fzy = c36010Fv8.A0F;
            Long valueOf = Long.valueOf(j);
            long j2 = ey2.A00;
            Boolean valueOf2 = Boolean.valueOf(z);
            C34721FRi c34721FRi = c36303Fzy.A01;
            if (c34721FRi != null) {
                boolean booleanValue = valueOf2.booleanValue();
                String str6 = c34721FRi.A07;
                if (str6 != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "universal_search_result_selected");
                    if (A0f.isSampled()) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("query_string", c34721FRi.A06);
                        if (booleanValue) {
                            enumC33521Eru = EnumC33521Eru.A0C;
                        } else {
                            enumC33521Eru = EnumC33521Eru.A0D;
                        }
                        c0Zx.A01(enumC33521Eru, "result_type");
                        AbstractC31176DnK.A1N(c0Zx, j2);
                        A0f.AAQ(c0Zx, "search_result");
                        A0f.A8R(EnumC33520Ert.A08, "ui_section");
                        AbstractC31173DnH.A1L(A0f, str6);
                        A0f.AAk("data_sources", AbstractC166987dD.A1J(EnumC33482ErH.SERVER_ENTITIES_NAMED_DSQ1));
                        A0f.AAP("bot_response_id", str3);
                        A0f.AAk("recipient_ids", AbstractC166987dD.A1J(AbstractC25228BEl.A13(AbstractC31271Dot.A00(c34721FRi.A0F))));
                        A0f.A9K("ui_section_index", valueOf);
                        A0f.Cht();
                    }
                }
            }
            C32021E4z A00 = FVU.A00(EnumC33443EqF.NULL_STATE_PROMPT, F7I.A00(str5, str3, str4, c38686GzR.A04, c38686GzR.A02, c38686GzR.A03, str, (List) c38686GzR.A01, (List) c38686GzR.A00), c36010Fv8.A0D, c36010Fv8.A02.A01.A05, null);
            if (z) {
                str2 = "igd_universal_search:serp_snippet_donut";
            } else {
                str2 = "igd_universal_search:serp_snippet_pill";
            }
            C36010Fv8.A01(A00, c36010Fv8, str2, c36010Fv8.A02.A01.A05, true);
        }
    }
}
