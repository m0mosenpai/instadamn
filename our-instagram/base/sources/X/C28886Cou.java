package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cou, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28886Cou implements InterfaceC52932ba {
    public final UserSession A00;

    public C28886Cou(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        UserSession userSession = this.A00;
        return new C25819Bba(new C221219pj(userSession, new CPI(userSession)));
    }
}
