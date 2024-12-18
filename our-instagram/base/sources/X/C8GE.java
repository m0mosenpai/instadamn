package X;

/* renamed from: X.8GE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GE {
    public EnumC1810481g A00;
    public final InterfaceC09390do A01;

    public final InterfaceC189798ay A00() {
        int ordinal;
        if (C2B0.A00(C05F.A15) && (ordinal = this.A00.ordinal()) != 0) {
            if (ordinal == 1) {
                return new C23801AgC();
            }
            throw new RuntimeException();
        }
        return (InterfaceC189798ay) this.A01.getValue();
    }

    public C8GE(InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = AbstractC09440dt.A01(new C9E4(interfaceC16820sZ, 19));
        if (C2B0.A00(C05F.A15)) {
            ((C1809981b) interfaceC1810081c).A00.A01.add(new C23850Agz(this));
        }
        this.A00 = ((C1809981b) interfaceC1810081c).A00.A00;
    }
}
