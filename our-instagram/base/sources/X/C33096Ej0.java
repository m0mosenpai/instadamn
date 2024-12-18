package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ej0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33096Ej0 extends C4A7 implements InterfaceC50482MQk {
    public final int A00;
    public final UserSession A01;
    public final FQB A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C137756Lx A06;
    public final C0UO A07;

    public C33096Ej0(UserSession userSession) {
        super("search_interop", C4A8.A00(359266386));
        this.A01 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A04 = A0o;
        this.A05 = A0o;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A03 = A1A;
        this.A07 = A1A;
        this.A00 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36595316090210424L);
        C137756Lx A00 = C137746Lw.A00(userSession, "OptionalE2eeRepository");
        this.A06 = A00;
        this.A02 = new FQB(A00);
    }

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
        AbstractC166987dD.A1Z(new MCF(this, str, null, 24), super.A01);
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A05;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A07;
    }
}
