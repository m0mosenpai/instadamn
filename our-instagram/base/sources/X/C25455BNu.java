package X;

/* renamed from: X.BNu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25455BNu implements InterfaceC74263Vh {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ C2XI A02;
    public final /* synthetic */ C25454BNt A03;

    @Override // X.InterfaceC74263Vh
    public final void E4K() {
    }

    public C25455BNu(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C25454BNt c25454BNt) {
        this.A01 = c2xi;
        this.A03 = c25454BNt;
        this.A02 = c2xi2;
        this.A00 = c2xi3;
    }

    @Override // X.InterfaceC74263Vh
    public final void Cwm(C37905Gm2 c37905Gm2, float f, float f2, float f3, float f4) {
        C2XI c2xi = this.A01;
        Float valueOf = Float.valueOf((this.A03.A00 + 1.0f) * f);
        c2xi.A00(valueOf);
        this.A02.A00(valueOf);
        AbstractC25227BEk.A1D(this.A00, f4);
    }
}
