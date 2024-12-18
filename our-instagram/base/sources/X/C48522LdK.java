package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.LdK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48522LdK implements InterfaceC13000lm, InterfaceC43417JGh {
    public final InterfaceC40711ue A00;
    public final UserFlowLogger A01;
    public final C19L A02;
    public final InterfaceC24741Ir A03;

    @Override // X.InterfaceC43417JGh
    public final void DVO(C54702OEe c54702OEe, long j) {
        AbstractC166987dD.A1Z(new C50121MBv(c54702OEe, this, null, 13, j), this.A02);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC166987dD.A1Z(new C43172J6r(this, null, 13), this.A02);
    }

    public C48522LdK(InterfaceC40711ue interfaceC40711ue, UserFlowLogger userFlowLogger, C19L c19l) {
        this.A02 = c19l;
        this.A00 = interfaceC40711ue;
        this.A01 = userFlowLogger;
        InterfaceC16620sF c57166PZk = new C57166PZk(this, null, 21);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C12W A01 = AbstractC23651Dv.A01(anonymousClass191, c19l);
        C3Iv c3Iv = new C3Iv(A01, new C24721Ip(0), false);
        c3Iv.A0P((AnonymousClass195) A01.get(AnonymousClass195.A00));
        c3Iv.A0W(num, c3Iv, c57166PZk);
        this.A03 = c3Iv;
    }
}
