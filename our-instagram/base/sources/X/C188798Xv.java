package X;

/* renamed from: X.8Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188798Xv {
    public EnumC1810481g A00;
    public boolean A01;
    public final InterfaceC09390do A02;

    public final C8YY A00() {
        int ordinal;
        if (C2B0.A00(C05F.A0j) && (ordinal = this.A00.ordinal()) != 0 && ordinal != 1) {
            throw new RuntimeException();
        }
        return (C8YY) this.A02.getValue();
    }

    public C188798Xv(InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = AbstractC09440dt.A01(new C9F5(7, interfaceC16820sZ, this));
        if (C2B0.A00(C05F.A0j)) {
            ((C1809981b) interfaceC1810081c).A00.A01.add(new C23849Agy(this));
        }
        this.A00 = ((C1809981b) interfaceC1810081c).A00.A00;
    }
}
