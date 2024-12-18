package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fz2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36249Fz2 implements InterfaceC1345866i {
    public final /* synthetic */ C7TP A00;
    public final /* synthetic */ InterfaceC83733oI A01;

    public C36249Fz2(C7TP c7tp, InterfaceC83733oI interfaceC83733oI) {
        this.A00 = c7tp;
        this.A01 = interfaceC83733oI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1fx, X.1OW] */
    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        UserSession userSession = this.A00.A00;
        String A0c = AbstractC31171DnF.A0c(this.A01);
        C14360o3.A0B(A0c, 1);
        ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C32131fx.class, 1));
        c1ow.A00 = A0c;
        c1ow.A01 = true;
        AbstractC31173DnH.A1U(userSession, c1ow);
        c1346766r.A02(true);
        c1346766r.A00();
    }
}
