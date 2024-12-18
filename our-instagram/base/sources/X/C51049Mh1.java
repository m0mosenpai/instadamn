package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mh1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51049Mh1 extends AbstractC52922bZ implements InterfaceC52932ba {
    public final InterfaceC15070pN A00;
    public final UserSession A01;
    public final InterfaceC06180Ui A02;

    public C51049Mh1(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        AnonymousClass057 A0t = MSY.A0t();
        this.A02 = A0t;
        this.A00 = MSX.A0r(A0t);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls) {
        throw AbstractC166987dD.A1D("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
