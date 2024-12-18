package X;

/* loaded from: classes9.dex */
public final class PA4 implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final String A00;
    public final boolean A01;
    public final EnumC53328Ni7 A02;
    public final InterfaceC16660sJ A03;

    public PA4(String str, String str2, int i, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = z;
        this.A00 = str2;
        this.A02 = EnumC53328Ni7.A0s;
        C25309BIe c25309BIe = new C25309BIe(this, str, i, 4);
        C14360o3.A0B(c25309BIe, 1);
        this.A03 = c25309BIe;
    }

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A03;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A02;
    }
}
