package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ItE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42595ItE implements JG5 {
    public final /* synthetic */ C690338p A00;
    public final /* synthetic */ InterfaceC38381qS A01;

    public C42595ItE(C690338p c690338p, InterfaceC38381qS interfaceC38381qS) {
        this.A00 = c690338p;
        this.A01 = interfaceC38381qS;
    }

    @Override // X.JG5
    public final void Dtg(InterfaceC38381qS interfaceC38381qS) {
        UserSession userSession = this.A00.A00;
        C3YT A00 = C3YS.A00(userSession);
        C38321qM c38321qM = (C38321qM) this.A01;
        A00.A02(c38321qM, true);
        AbstractC25651Mw.A00(userSession).E4s(new C42251Inb(c38321qM));
    }
}
