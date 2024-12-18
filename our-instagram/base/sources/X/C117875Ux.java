package X;

/* renamed from: X.5Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117875Ux implements C2DD {
    public InterfaceC118965aD A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C2DD
    public final void CuG() {
    }

    @Override // X.C2DD
    public final void DI8() {
        InterfaceC118965aD interfaceC118965aD = this.A00;
        if (interfaceC118965aD != null) {
            interfaceC118965aD.dispose();
        }
        this.A00 = null;
    }

    @Override // X.C2DD
    public final void Deh() {
        this.A00 = (InterfaceC118965aD) this.A01.invoke(C5UX.A00);
    }

    public C117875Ux(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
