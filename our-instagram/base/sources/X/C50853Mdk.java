package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50853Mdk extends C9U7 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        OLJ A00;
        boolean A1b = AbstractC25233BEq.A1b(str, cls, c152406tQ);
        String str2 = (String) c152406tQ.A00("formID");
        P4V p4v = null;
        if (str2 != null && (A00 = OVX.A01.A00(str2)) != null) {
            UserSession userSession = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            String A0h = AbstractC50522MSa.A0h(c152406tQ, "adID");
            String A0h2 = AbstractC50522MSa.A0h(c152406tQ, "trackingToken");
            String A0h3 = AbstractC50522MSa.A0h(c152406tQ, "ad_creation_source");
            if (A0h3 == null) {
                A0h3 = "UNKNOWN";
            }
            p4v = new P4V(interfaceC11380iw, userSession, A0h, A0h2, str2, A0h3, AbstractC50523MSb.A0S(c152406tQ), (String) c152406tQ.A00("advertiser_fbidv2"), this.A02, C55226Oet.A08(A00), A00.A02(), AbstractC167007dF.A1W(A00.A00.A00), AbstractC166997dE.A1Z(c152406tQ.A00("is_form_extension"), A1b));
        }
        return new C51000Mg7(c152406tQ, this.A01, p4v);
    }

    public C50853Mdk(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC31171DnF.A0G(bundle);
        this.A02 = C55226Oet.A03(bundle);
    }
}
