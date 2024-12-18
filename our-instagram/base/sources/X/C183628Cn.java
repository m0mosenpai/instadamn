package X;

/* renamed from: X.8Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183628Cn implements InterfaceC52932ba {
    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls) {
        throw new UnsupportedOperationException(MSV.A00(79));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(abstractC52972be, 1);
        InterfaceC52932ba interfaceC52932ba = (InterfaceC52932ba) abstractC52972be.A00(C186298Nx.A00);
        InterfaceC52932ba interfaceC52932ba2 = interfaceC52932ba;
        if (interfaceC52932ba == null) {
            interfaceC52932ba2 = new Object();
        }
        return interfaceC52932ba2.create(cls, abstractC52972be);
    }
}
