package X;

/* renamed from: X.2cS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C53442cS implements InterfaceC52932ba {
    public static C53442cS A00;
    public static final InterfaceC51892Zn A01 = C52952bc.A00;

    @Override // X.InterfaceC52932ba
    public AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        return AbstractC152416tR.A00(cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(interfaceC16510rw, 0);
        C14360o3.A0B(abstractC52972be, 1);
        return create(AbstractC53012bi.A00(interfaceC16510rw), abstractC52972be);
    }

    @Override // X.InterfaceC52932ba
    public AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 0);
        return create(cls);
    }
}
