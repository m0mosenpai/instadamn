package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ctf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29174Ctf implements InterfaceC43071ya {
    public final ClipsViewerConfig A00;
    public final UserSession A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C75113Zb c75113Zb;
        int intValue;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C38321qM c38321qM = ((C120985dq) c59062n7.A03).A02;
        if (c38321qM != null && (c75113Zb = ((C37644Ghd) c59062n7.A04).A0E) != null && (intValue = interfaceC57162jr.CFq(c59062n7).intValue()) != 0 && intValue != A1R) {
            UserSession userSession = this.A01;
            if (C18U.A06(C06090Tz.A05, userSession, 36326683065727010L) && c75113Zb.A1p) {
                AbstractC25651Mw.A00(userSession).E4s(new C72243Lx(c38321qM));
            }
        }
    }

    public C29174Ctf(ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, clipsViewerConfig);
        this.A01 = userSession;
        this.A00 = clipsViewerConfig;
    }
}
