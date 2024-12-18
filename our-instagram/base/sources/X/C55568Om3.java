package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Om3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55568Om3 implements InterfaceC52932ba {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass840 A01;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    public C55568Om3(UserSession userSession, AnonymousClass840 anonymousClass840) {
        this.A00 = userSession;
        this.A01 = anonymousClass840;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new C51051Mh5(this.A00, this.A01);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
