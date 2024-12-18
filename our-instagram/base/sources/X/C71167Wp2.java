package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wp2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71167Wp2 implements InterfaceC58007Pnr {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C71603Jf A01;
    public final /* synthetic */ String A02;

    public C71167Wp2(UserSession userSession, C71603Jf c71603Jf, String str) {
        this.A00 = userSession;
        this.A01 = c71603Jf;
        this.A02 = str;
    }

    @Override // X.InterfaceC58007Pnr
    public final void DqJ(boolean z) {
        UserSession userSession = this.A00;
        AbstractC206099Aq.A06(userSession);
        AbstractC25651Mw.A00(userSession).E4s(new C2AT(true));
        InterfaceC11380iw interfaceC11380iw = AbstractC206099Aq.A00;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        new C65761Ttc(interfaceC11380iw, userSession).A03(this.A01.A03(0L), null, null, null, null, this.A02, true, false);
    }
}
