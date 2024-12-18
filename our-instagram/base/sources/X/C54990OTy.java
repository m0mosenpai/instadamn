package X;

import java.util.LinkedHashMap;

/* renamed from: X.OTy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54990OTy {
    public final EnumC39589Hdz A00;
    public final OLM A01;
    public final EnumC72375XcB A02;
    public final String A03;

    public static void A00(C54990OTy c54990OTy, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OLM olm = c54990OTy.A01;
        String str = c54990OTy.A03;
        olm.A00(c54990OTy.A00, c54990OTy.A02, C05F.A00, num, str, linkedHashMap);
    }

    public C54990OTy(EnumC39589Hdz enumC39589Hdz, OLM olm, EnumC72375XcB enumC72375XcB, String str) {
        this.A03 = str;
        this.A00 = enumC39589Hdz;
        this.A02 = enumC72375XcB;
        this.A01 = olm;
    }
}
