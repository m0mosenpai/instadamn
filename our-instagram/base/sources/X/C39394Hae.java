package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39394Hae extends AbstractC86353t7 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ HD4 A01;
    public final /* synthetic */ String A02;

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void Dyj(C51752Mtb c51752Mtb) {
        UserSession A0r;
        InterfaceC60442pS interfaceC60442pS;
        String str;
        C14360o3.A0B(c51752Mtb, 0);
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            int i = c51752Mtb.A00;
            if (i == 1 && c51752Mtb.A01 == 2) {
                HD4 hd4 = this.A01;
                A0r = AbstractC166987dD.A0r(hd4.A0O);
                interfaceC60442pS = hd4.A0M;
                str = "bottom_sheet_swipe_up_fullscreen";
            } else {
                if (i != 2 || c51752Mtb.A01 != 1) {
                    return;
                }
                HD4 hd42 = this.A01;
                A0r = AbstractC166987dD.A0r(hd42.A0O);
                interfaceC60442pS = hd42.A0M;
                str = "bottom_sheet_swipe_down_dismiss";
            }
            C6Qi.A00(A0r, c38321qM, interfaceC60442pS, str);
        }
    }

    public C39394Hae(C38321qM c38321qM, HD4 hd4, String str) {
        this.A00 = c38321qM;
        this.A01 = hd4;
        this.A02 = str;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DId(Integer num) {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            HD4 hd4 = this.A01;
            if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0r(hd4.A0O), 36318818981190152L)) {
                String str = this.A02;
                C42590It8 c42590It8 = hd4.A0B;
                if (c42590It8 == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                AbstractC41772Ieo.A07(c38321qM, c42590It8.A00(null, c38321qM, C2Fb.A2p), "webclick", str);
            }
        }
    }
}
