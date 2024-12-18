package X;

/* renamed from: X.8Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183468Bt {
    public final InterfaceC09390do A00;
    public final InterfaceC1810081c A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(C183478Bu.A00);

    public final InterfaceC189758au A00() {
        InterfaceC09390do interfaceC09390do;
        if (C2B0.A00(C05F.A0N) && ((C1809981b) this.A01).A00.A00.ordinal() != 0) {
            interfaceC09390do = this.A02;
        } else {
            interfaceC09390do = this.A00;
        }
        return (InterfaceC189758au) interfaceC09390do.getValue();
    }

    public C183468Bt(InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC1810081c;
        this.A00 = AbstractC09440dt.A01(new C9ES(interfaceC16820sZ, 47));
        if (C2B0.A00(C05F.A0N)) {
            ((C1809981b) interfaceC1810081c).A00.A01.add(new C82O() { // from class: X.8Bv
                @Override // X.C82O
                public final /* bridge */ /* synthetic */ void F8V(Object obj) {
                    C14360o3.A0B(obj, 0);
                    if (obj == EnumC1810481g.A03) {
                        ((InterfaceC189758au) C183468Bt.this.A00.getValue()).Eoi();
                    }
                }
            });
        }
    }
}
