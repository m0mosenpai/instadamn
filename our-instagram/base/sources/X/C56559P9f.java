package X;

/* renamed from: X.P9f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56559P9f implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final Integer A00;
    public final EnumC53328Ni7 A01;
    public final InterfaceC16660sJ A02;

    public C56559P9f(Integer num) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = EnumC53328Ni7.A07;
        C57754Pjh c57754Pjh = new C57754Pjh(this, 12);
        C14360o3.A0B(c57754Pjh, 1);
        this.A02 = c57754Pjh;
    }

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A02;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A01;
    }
}
