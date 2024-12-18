package X;

/* renamed from: X.WQs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70312WQs implements InterfaceC52932ba {
    public final UFS A00;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.equals(UFI.class)) {
            return new UFI(this.A00);
        }
        throw new IllegalArgumentException("Input class not implemented");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    public C70312WQs(UFS ufs) {
        this.A00 = ufs;
    }
}
