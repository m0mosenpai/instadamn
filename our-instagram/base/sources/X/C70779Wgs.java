package X;

/* renamed from: X.Wgs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70779Wgs implements InterfaceC12870lZ {
    public boolean A00;
    public final int A01;
    public final String A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A04, X4W.A00);
    public final boolean A04;

    public C70779Wgs(String str, int i, boolean z) {
        this.A02 = str;
        this.A01 = i;
        this.A04 = z;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1814169166);
        C14120nc.A00().ATO(new C68021V6n(this, false));
        C0f9.A0A(-267956354, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1595537475);
        C14120nc.A00().ATO(new C68021V6n(this, true));
        C0f9.A0A(-1502908439, A03);
    }
}
