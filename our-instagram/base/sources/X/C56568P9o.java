package X;

/* renamed from: X.P9o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56568P9o implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final EnumC53238Ngb A00;
    public final EnumC53328Ni7 A01;
    public final InterfaceC16660sJ A02;

    public C56568P9o(EnumC53238Ngb enumC53238Ngb) {
        C14360o3.A0B(enumC53238Ngb, 1);
        this.A00 = enumC53238Ngb;
        this.A01 = EnumC53328Ni7.A06;
        C57754Pjh c57754Pjh = new C57754Pjh(this, 31);
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
