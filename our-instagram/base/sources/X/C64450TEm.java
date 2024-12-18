package X;

/* renamed from: X.TEm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64450TEm implements InterfaceC65450TkM {
    public final /* synthetic */ C64486TFw A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public C64450TEm(C64486TFw c64486TFw, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A00 = c64486TFw;
    }

    @Override // X.InterfaceC65450TkM
    public final void CyI(String str, boolean z) {
        C6FX A0I = AbstractC31179DnN.A0I(str);
        A0I.A02(Boolean.valueOf(z));
        C131845xK.A00(this.A01, A0I.A00(), this.A02);
        this.A00.A00 = null;
    }
}
