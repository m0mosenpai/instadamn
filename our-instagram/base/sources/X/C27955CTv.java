package X;

/* renamed from: X.CTv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27955CTv {
    public final InterfaceC74963Ym A00;
    public final CT6 A01;
    public final String A02;

    public C27955CTv(CT6 ct6) {
        C14360o3.A0B(ct6, 1);
        this.A01 = ct6;
        this.A02 = AbstractC167017dG.A0j();
        this.A00 = AbstractC25225BEi.A0L(null, new DGU(this, 5));
    }

    public final void A00() {
        C26027BfG c26027BfG;
        CT6 ct6 = this.A01;
        String str = this.A02;
        InterfaceC74953Yl interfaceC74953Yl = ct6.A06;
        if (!AbstractC25229BEm.A1U(interfaceC74953Yl, str) && (c26027BfG = (C26027BfG) ct6.A07.get(str)) != null) {
            ct6.A04 = true;
            interfaceC74953Yl.Egh(str);
            ct6.A02 = c26027BfG.A01;
            ct6.A01 = c26027BfG.A00;
            ct6.A00 = c26027BfG.A00();
            ct6.A03 = false;
        }
    }
}
