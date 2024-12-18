package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OIV {
    public final C58252li A00;
    public final O8F A01;
    public final C54694ODu A02;

    public final void A00(OKv oKv, String str) {
        String str2;
        C14360o3.A0B(str, 1);
        C54694ODu c54694ODu = this.A02;
        UserSession userSession = c54694ODu.A02;
        String str3 = oKv.A01;
        boolean z = oKv.A03;
        boolean z2 = oKv.A04;
        boolean z3 = oKv.A02;
        if (z3) {
            str2 = null;
        } else {
            str2 = c54694ODu.A03.A03.A07;
        }
        MusicProduct musicProduct = c54694ODu.A01;
        String str4 = c54694ODu.A05;
        C14360o3.A0B(str3, 1);
        C25621Ms A00 = C50675MYt.A00(musicProduct, userSession, str3, str2, str4, str, z, z2);
        if (str2 != null) {
            A00.A9s("cursor", str2);
        }
        C1ON A0N = A00.A0N();
        A0N.A01 = new C55912Os4(c54694ODu, str3, A0N.hashCode());
        C54428O3i c54428O3i = c54694ODu.A04;
        A0N.hashCode();
        MSZ.A0V(c54428O3i.A00.A0A).A0B(str3);
        NLp nLp = new NLp(oKv, c54694ODu, A0N.hashCode());
        if (z3) {
            C25621Ms A002 = C50675MYt.A00(musicProduct, userSession, str3, null, str4, str, z, z2);
            A002.A08(C05F.A0C);
            C1ON A0N2 = A002.A0N();
            C154796xU c154796xU = c54694ODu.A03;
            C154806xV c154806xV = c154796xU.A03;
            C1GL c1gl = c154796xU.A02;
            NA6 na6 = new NA6(c154796xU.A00, c1gl, nLp, c154806xV);
            A0N2.A00 = na6;
            c1gl.schedule(A0N2);
            A0N.A00 = new C152456tY(A0N, na6, nLp, c154806xV);
            c1gl.schedule(A0N);
            return;
        }
        c54694ODu.A03.A03(A0N, nLp);
    }

    public OIV(O8F o8f, C54694ODu c54694ODu) {
        this.A02 = c54694ODu;
        this.A01 = o8f;
        C58252li c58252li = new C58252li();
        this.A00 = c58252li;
        C55562Olw.A00(o8f.A00, c58252li, MSW.A1E(c58252li, 34), 64);
        C55562Olw.A00(c54694ODu.A00, c58252li, C57745PjY.A00(this, 49), 64);
    }
}
