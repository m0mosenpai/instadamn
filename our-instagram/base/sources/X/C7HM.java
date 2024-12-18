package X;

/* renamed from: X.7HM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HM implements C7H3 {
    public final InterfaceC16660sJ A00;
    public final InterfaceC160017Fn A01;

    @Override // X.C7H3
    public final boolean Cp3(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (!z || z2 || !z3 || z4) {
            return false;
        }
        InterfaceC160017Fn interfaceC160017Fn = this.A01;
        interfaceC160017Fn.FCC(false, new C206819Dm(this, 41));
        interfaceC160017Fn.Cnr(C05F.A01, true);
        return true;
    }

    public C7HM(InterfaceC160017Fn interfaceC160017Fn, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC160017Fn;
        this.A00 = interfaceC16660sJ;
    }
}
