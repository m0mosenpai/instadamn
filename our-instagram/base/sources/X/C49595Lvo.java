package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lvo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49595Lvo implements GZQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C49595Lvo(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, int i) {
        this.A00 = i;
        this.A04 = userSession;
        this.A01 = c6fq;
        this.A03 = interfaceC103384lE;
        this.A02 = interfaceC103384lE2;
    }

    @Override // X.GZQ
    public final void DFf() {
        C131845xK.A00((C6FQ) this.A01, C6FW.A01, (InterfaceC103384lE) this.A02);
    }

    @Override // X.GZQ
    public final void DqL(boolean z, boolean z2) {
        int i = this.A00;
        C130755vO A00 = AbstractC130745vN.A00((UserSession) this.A04);
        if (1 - i != 0) {
            A00.A01(C05F.A00, z, false);
        } else {
            A00.A01(C05F.A01, z2, false);
        }
        C131845xK.A00((C6FQ) this.A01, C6FW.A01, (InterfaceC103384lE) this.A03);
    }
}
