package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AUT implements InterfaceC52932ba {
    public final UserSession A00;
    public final C1810281e A01;
    public final /* synthetic */ InterfaceC52932ba A02;

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        this.A02.create(cls);
        throw null;
    }

    public AUT(UserSession userSession, C1810281e c1810281e) {
        this.A02 = C186268Nu.A00(new C186258Nt(new BAO(39, c1810281e, userSession), new C0YZ(C210769Ty.class)));
        this.A00 = userSession;
        this.A01 = c1810281e;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        AbstractC167017dG.A1N(interfaceC16510rw, abstractC52972be);
        return this.A02.create(interfaceC16510rw, abstractC52972be);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        AbstractC167017dG.A1N(cls, abstractC52972be);
        return this.A02.create(cls, abstractC52972be);
    }
}
