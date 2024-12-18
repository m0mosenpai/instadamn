package X;

/* renamed from: X.2cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53422cQ implements InterfaceC52932ba {
    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return new C53462cU();
    }
}
