package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AdM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23627AdM implements InterfaceC12870lZ, InterfaceC13050lr {
    public final UserSession A00;

    public C23627AdM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36320622866932504L)) {
            C218914p.A04(EnumC220415e.A02, this, false, false);
        } else {
            C218914p.A05(this);
        }
    }

    public final void A00() {
        UserSession userSession = this.A00;
        C17790uH A00 = AbstractC17610tw.A00(userSession);
        C17590tu c17590tu = new C17590tu(A00);
        String str = c17590tu.A00;
        if (str != null && str.length() == 0) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("feed/timeline_metadata_update/");
            A0c.A0H("feed_view_info", str);
            A0c.A0R(C40781ul.class, C55702hA.class);
            C1ON A0N = A0c.A0N();
            A0N.A00 = new C37484Gf2(6, c17590tu, A00);
            C1GJ.A06(A0N, 902662556, 3, false, false);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-2070627620);
        A00();
        C0f9.A0A(-1172910769, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-543678614, C0f9.A03(246510867));
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A00();
        if (AbstractC201688vy.A01(this.A00, C05F.A15)) {
            C218914p.A07(this);
            C218914p.A06(this);
        }
    }
}
