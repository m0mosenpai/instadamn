package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WhN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70807WhN implements InterfaceC13000lm {
    public C1ON A00;
    public C1ON A01;
    public V0R A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public final C66081TzI A06;
    public final C66081TzI A07;
    public final UserSession A08;
    public final C34925FaB A09;
    public final C2056398n A0A;
    public final InterfaceC11380iw A0B;

    public final void A00() {
        synchronized (this) {
            C25621Ms A0M = AbstractC31177DnL.A0M(this.A08);
            A0M.A0B("direct_v2/welcome_message/get/");
            A0M.A0R(H9F.class, IOJ.class);
            C1ON A0N = A0M.A0N();
            this.A01 = A0N;
            A0N.A00 = this.A07;
            C1GJ.A03(A0N);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A08.A03(C70807WhN.class);
    }

    public C70807WhN(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A08 = userSession;
        this.A0B = interfaceC11380iw;
        this.A0A = AbstractC2056298m.A00(userSession);
        this.A09 = new C34925FaB(interfaceC11380iw, userSession);
        this.A05 = "";
        this.A04 = "";
        this.A07 = new C66081TzI(this, 27);
        this.A06 = new C66081TzI(this, 26);
    }
}
