package X;

/* renamed from: X.OuT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56052OuT implements InterfaceC12870lZ {
    public final /* synthetic */ C52714NTz A00;

    public C56052OuT(C52714NTz c52714NTz) {
        this.A00 = c52714NTz;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(212582979);
        C52714NTz c52714NTz = this.A00;
        c52714NTz.A02 = false;
        C52714NTz.A00(c52714NTz);
        C0f9.A0A(-1357789421, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-526631079);
        C52714NTz c52714NTz = this.A00;
        c52714NTz.A02 = true;
        C52714NTz.A00(c52714NTz);
        C0f9.A0A(1834802671, A03);
    }
}
