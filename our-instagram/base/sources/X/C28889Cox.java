package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cox, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28889Cox implements InterfaceC52932ba {
    public final UserSession A00;
    public final String A01;
    public final String A02;

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
        return new C25850Bc5(userSession, AbstractC27688CJh.A00(userSession), this.A02, this.A01);
    }

    public C28889Cox(UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
