package X;

/* renamed from: X.8Ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186248Ns implements InterfaceC52932ba {
    public final C1810281e A00;
    public final /* synthetic */ InterfaceC52932ba A01;

    public C186248Ns(C1810281e c1810281e) {
        C14360o3.A0B(c1810281e, 1);
        this.A01 = C186268Nu.A00(new C186258Nt(new C9EB(c1810281e, 41), new C0YZ(C186238Nr.class)));
        this.A00 = c1810281e;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(interfaceC16510rw, 0);
        C14360o3.A0B(abstractC52972be, 1);
        return this.A01.create(interfaceC16510rw, abstractC52972be);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        this.A01.create(cls);
        throw null;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(abstractC52972be, 1);
        return this.A01.create(cls, abstractC52972be);
    }
}
