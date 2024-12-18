package X;

/* renamed from: X.Fr4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35767Fr4 implements InterfaceC52932ba {
    public final C55004OVk A00;
    public final C12W A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;

    public C35767Fr4(C55004OVk c55004OVk, C12W c12w, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(c55004OVk, 1);
        this.A00 = c55004OVk;
        this.A01 = c12w;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.isAssignableFrom(C51029Mgc.class)) {
            return new C51029Mgc(this.A00, this.A01, this.A02, this.A03);
        }
        throw AbstractC166987dD.A12(AbstractC167017dG.A0n(cls, AbstractC58317Pt9.A00(74), AbstractC166987dD.A1C()));
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }
}
