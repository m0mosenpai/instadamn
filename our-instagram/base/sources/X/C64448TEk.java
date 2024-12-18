package X;

/* renamed from: X.TEk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64448TEk implements InterfaceC65449TkL {
    public final /* synthetic */ C64487TFx A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public C64448TEk(C64487TFx c64487TFx, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A00 = c64487TFx;
    }

    @Override // X.InterfaceC65449TkL
    public final void FE4(String str, boolean z) {
        C6FX A0I = AbstractC31179DnN.A0I(str);
        A0I.A02(Boolean.valueOf(z));
        C131845xK.A00(this.A01, A0I.A00(), this.A02);
        C64487TFx c64487TFx = this.A00;
        c64487TFx.A00 = null;
        c64487TFx.A01 = null;
    }
}
