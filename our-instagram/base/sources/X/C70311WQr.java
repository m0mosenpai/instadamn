package X;

/* renamed from: X.WQr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70311WQr implements InterfaceC52932ba {
    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.isAssignableFrom(UFP.class)) {
            return new UFP();
        }
        throw AbstractC37303Gc4.A0M(cls, "Unknown ViewModel class: ", new StringBuilder());
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }
}
