package X;

/* renamed from: X.P9d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56557P9d implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final EnumC53328Ni7 A00;
    public final InterfaceC16660sJ A01;

    public C56557P9d(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = EnumC53328Ni7.A0r;
        DHR dhr = new DHR(str, str2, 1);
        C14360o3.A0B(dhr, 1);
        this.A01 = dhr;
    }

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A01;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A00;
    }
}
