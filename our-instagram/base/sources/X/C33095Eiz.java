package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eiz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33095Eiz extends C4A7 implements InterfaceC50482MQk {
    public InterfaceC37208GaJ A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final UserSession A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;

    public C33095Eiz(UserSession userSession) {
        super("search_interop", C4A8.A00(359266386));
        this.A04 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A05 = A0o;
        this.A07 = A0o;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A02 = A1A;
        this.A06 = A1A;
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A01 = A0h;
        this.A03 = A0h;
        InterfaceC37208GaJ A00 = AbstractC44044JdV.A00(userSession);
        this.A00 = A00;
        if (A00 != null) {
            A00.start();
        }
        InterfaceC37208GaJ interfaceC37208GaJ = this.A00;
        if (interfaceC37208GaJ != null) {
            interfaceC37208GaJ.ChV();
        }
        InterfaceC37208GaJ interfaceC37208GaJ2 = this.A00;
        if (interfaceC37208GaJ2 != null) {
            GKK.A00(interfaceC37208GaJ2.ANg().A0O(AbstractC142856cl.A01), AbstractC31174DnI.A0S(), this, 22);
        }
    }

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A07;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A06;
    }
}
