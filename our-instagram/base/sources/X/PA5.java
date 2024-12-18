package X;

/* loaded from: classes9.dex */
public final class PA5 implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final String A00;
    public final boolean A01;
    public final EnumC53328Ni7 A02 = EnumC53328Ni7.A15;
    public final InterfaceC16660sJ A03;

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A03;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A02;
    }

    public PA5(C0x9 c0x9, String str, boolean z) {
        this.A01 = z;
        this.A00 = str;
        C57750Pjd c57750Pjd = new C57750Pjd(18, this, c0x9);
        C14360o3.A0B(c57750Pjd, 1);
        this.A03 = c57750Pjd;
    }
}
