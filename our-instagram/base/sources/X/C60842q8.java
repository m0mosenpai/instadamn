package X;

/* renamed from: X.2q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60842q8 implements InterfaceC09390do {
    public AbstractC52922bZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16510rw A04;

    @Override // X.InterfaceC09390do
    public final boolean CWa() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC09390do
    public final /* bridge */ /* synthetic */ Object getValue() {
        AbstractC52922bZ abstractC52922bZ = this.A00;
        if (abstractC52922bZ == null) {
            C018307d c018307d = (C018307d) this.A03.invoke();
            InterfaceC52932ba interfaceC52932ba = (InterfaceC52932ba) this.A02.invoke();
            AbstractC52972be abstractC52972be = (AbstractC52972be) this.A01.invoke();
            C14360o3.A0B(c018307d, 0);
            C14360o3.A0B(interfaceC52932ba, 1);
            C14360o3.A0B(abstractC52972be, 2);
            AbstractC52922bZ A02 = new C52942bb(interfaceC52932ba, c018307d, abstractC52972be).A02(this.A04);
            this.A00 = A02;
            return A02;
        }
        return abstractC52922bZ;
    }

    public C60842q8(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16510rw interfaceC16510rw) {
        this.A04 = interfaceC16510rw;
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A01 = interfaceC16820sZ3;
    }
}
