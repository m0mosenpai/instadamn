package X;

/* renamed from: X.8GF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GF {
    public final InterfaceC09390do A00;
    public final InterfaceC1810081c A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(DBL.A00);

    public final BEV A00() {
        InterfaceC09390do interfaceC09390do;
        if (C2B0.A00(C05F.A0C) && ((C1809981b) this.A01).A00.A00.ordinal() != 0) {
            interfaceC09390do = this.A02;
        } else {
            interfaceC09390do = this.A00;
        }
        return (BEV) interfaceC09390do.getValue();
    }

    public C8GF(InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC1810081c;
        this.A00 = AbstractC09440dt.A01(new B8Q(interfaceC16820sZ, 24));
        if (C2B0.A00(C05F.A0C)) {
            ((C1809981b) interfaceC1810081c).A00.A01.add(new Ah0(this));
        }
    }
}
