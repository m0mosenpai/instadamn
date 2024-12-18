package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OWU {
    public final EnumC39589Hdz A00;
    public final OLM A01;
    public final EnumC72375XcB A02;
    public final String A03;

    public OWU(EnumC39589Hdz enumC39589Hdz, OLM olm, EnumC72375XcB enumC72375XcB, String str) {
        C14360o3.A0B(olm, 4);
        this.A03 = str;
        this.A00 = enumC39589Hdz;
        this.A02 = enumC72375XcB;
        this.A01 = olm;
    }

    public final void A01(Integer num, Map map) {
        C14360o3.A0B(map, 1);
        OLM olm = this.A01;
        String str = this.A03;
        olm.A00(this.A00, this.A02, C05F.A01, num, str, map);
    }

    public static void A00(OWU owu, Integer num) {
        owu.A01(num, new LinkedHashMap());
    }

    public final void A02(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        A01(C05F.A0C, AbstractC06930Yk.A07(AbstractC25229BEm.A1b("new_value", str2, AbstractC166987dD.A1L("original_value", str))));
    }
}
