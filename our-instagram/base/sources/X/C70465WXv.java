package X;

/* renamed from: X.WXv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70465WXv implements X9O {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ boolean A02;

    public C70465WXv(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, boolean z) {
        this.A02 = z;
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
    }

    @Override // X.X9O
    public final void DYF(C4IC c4ic, Integer num) {
        if (this.A02 && c4ic == C4IC.A08) {
            c4ic = C4IC.A05;
        }
        InterfaceC103384lE interfaceC103384lE = this.A01;
        C6FX c6fx = new C6FX();
        c6fx.A01(c4ic.A00);
        C131845xK.A00(this.A00, c6fx.A00(), interfaceC103384lE);
    }
}
