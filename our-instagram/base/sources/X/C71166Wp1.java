package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wp1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71166Wp1 implements InterfaceC58007Pnr {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C71166Wp1(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = str;
    }

    @Override // X.InterfaceC58007Pnr
    public final void DqJ(boolean z) {
        UserSession userSession = this.A01;
        AbstractC206099Aq.A06(userSession);
        AbstractC25651Mw.A00(userSession).E4s(new C2AT(true));
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C65761Ttc c65761Ttc = new C65761Ttc(interfaceC11380iw, userSession);
        C69436VnL A03 = new C71603Jf(userSession).A03(C455127l.A03(userSession).A0O());
        String str = this.A02;
        if (str == null) {
            str = "unknown";
        }
        c65761Ttc.A03(A03, null, null, null, null, str, true, false);
    }
}
