package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Om6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55570Om6 implements InterfaceC52932ba {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC58179Pqj A04;
    public final /* synthetic */ OEB A05;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    public C55570Om6(UserSession userSession, InterfaceC58179Pqj interfaceC58179Pqj, OEB oeb, float f, int i, int i2) {
        this.A04 = interfaceC58179Pqj;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = oeb;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        InterfaceC58179Pqj interfaceC58179Pqj = this.A04;
        float f = this.A00;
        int i = this.A02;
        int i2 = this.A01;
        return new C50982Mfp(this.A03, interfaceC58179Pqj, this.A05, f, i, i2);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
