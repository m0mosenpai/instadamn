package X;

/* loaded from: classes9.dex */
public final class PA7 implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final EnumC53328Ni7 A03;
    public final InterfaceC16660sJ A04;

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A04;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A03;
    }

    public PA7(Integer num, Integer num2, String str) {
        AbstractC167027dH.A13(str, num, num2);
        this.A02 = str;
        this.A00 = num;
        this.A01 = num2;
        this.A03 = EnumC53328Ni7.A0P;
        this.A04 = C57754Pjh.A00(this, 21);
    }
}
