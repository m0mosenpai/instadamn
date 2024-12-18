package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cov, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28887Cov implements InterfaceC52932ba {
    public final UserSession A00;
    public final String A01;

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
        return new C25866BcL(this.A00, this.A01);
    }

    public C28887Cov(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
