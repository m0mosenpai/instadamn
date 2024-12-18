package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KZd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46037KZd extends C4A7 implements InterfaceC50482MQk {
    public final UserSession A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;

    public C46037KZd(UserSession userSession) {
        super("search_interop", C4A8.A00(359266386));
        this.A00 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A02 = A0o;
        this.A03 = A0o;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A01 = A1A;
        this.A04 = A1A;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A03;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A04;
    }

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
        AbstractC43594JPz.A1T(this.A01);
        AbstractC166987dD.A1Z(new MVR(this, str, (InterfaceC23621Ds) null, 11), super.A01);
    }
}
