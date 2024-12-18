package X;

/* renamed from: X.Oly, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55564Oly implements InterfaceC52932ba {
    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls) {
        throw AbstractC166987dD.A1D("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        AbstractC167017dG.A1N(cls, abstractC52972be);
        InterfaceC52932ba interfaceC52932ba = (InterfaceC52932ba) abstractC52972be.A00(Om9.A00);
        InterfaceC52932ba interfaceC52932ba2 = interfaceC52932ba;
        if (interfaceC52932ba == null) {
            interfaceC52932ba2 = new Object();
        }
        return interfaceC52932ba2.create(cls, abstractC52972be);
    }
}
