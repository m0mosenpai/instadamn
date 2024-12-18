package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FzB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36258FzB implements InterfaceC1345866i {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C7TP A01;
    public final /* synthetic */ InterfaceC83733oI A02;
    public final /* synthetic */ boolean A03;

    public C36258FzB(InterfaceC11380iw interfaceC11380iw, C7TP c7tp, InterfaceC83733oI interfaceC83733oI, boolean z) {
        this.A01 = c7tp;
        this.A02 = interfaceC83733oI;
        this.A03 = z;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        UserSession userSession = this.A01.A00;
        InterfaceC83733oI interfaceC83733oI = this.A02;
        AbstractC31278Dp0.A07(this.A00, userSession, AbstractC31171DnF.A0c(interfaceC83733oI), true, this.A03);
        AbstractC1345466e.A01(interfaceC83733oI);
        c1346766r.A02(true);
        c1346766r.A00();
    }
}
