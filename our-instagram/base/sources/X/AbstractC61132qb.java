package X;

/* renamed from: X.2qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61132qb implements InterfaceC52932ba {
    public abstract AbstractC52922bZ create();

    @Override // X.InterfaceC52932ba
    public /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        AbstractC52922bZ create = create();
        C14360o3.A0C(create, "null cannot be cast to non-null type T of com.instagram.common.mvvm.IgViewModelFactory.create");
        return create;
    }
}
