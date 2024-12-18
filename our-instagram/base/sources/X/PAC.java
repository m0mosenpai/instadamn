package X;

/* loaded from: classes9.dex */
public final class PAC implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final EnumC53328Ni7 A06;
    public final InterfaceC16660sJ A07;

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A07;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A06;
    }

    public PAC(Integer num, Integer num2, String str, String str2, long j, long j2) {
        AbstractC167027dH.A13(str, num, num2);
        this.A04 = str;
        this.A02 = num;
        this.A03 = num2;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = str2;
        this.A06 = EnumC53328Ni7.A0L;
        this.A07 = C57754Pjh.A00(this, 18);
    }
}
