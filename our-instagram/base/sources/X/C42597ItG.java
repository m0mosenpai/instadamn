package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ItG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42597ItG implements JG5 {
    public final /* synthetic */ InterfaceC38381qS A00;
    public final /* synthetic */ C693139r A01;

    public C42597ItG(InterfaceC38381qS interfaceC38381qS, C693139r c693139r) {
        this.A01 = c693139r;
        this.A00 = interfaceC38381qS;
    }

    @Override // X.JG5
    public final void Dtg(InterfaceC38381qS interfaceC38381qS) {
        UserSession userSession = this.A01.A00;
        IC4 ic4 = (IC4) userSession.A01(IC4.class, new DGY(userSession, 46));
        AbstractC31177DnL.A1N(ic4.A00, this.A00.getId(), true);
    }
}
