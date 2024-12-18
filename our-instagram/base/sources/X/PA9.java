package X;

/* loaded from: classes9.dex */
public final class PA9 implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final EnumC53328Ni7 A04;
    public final InterfaceC16660sJ A05;

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A05;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A04;
    }

    public PA9(Integer num, String str, String str2, long j) {
        AbstractC167017dG.A1P(str, num);
        this.A02 = str;
        this.A01 = num;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = EnumC53328Ni7.A0I;
        this.A05 = C57754Pjh.A00(this, 15);
    }
}
