package X;

/* loaded from: classes5.dex */
public final class BRR implements InterfaceC684236f {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ C2XI A02;

    public BRR(C2XI c2xi, C2XI c2xi2, C2XI c2xi3) {
        this.A01 = c2xi;
        this.A02 = c2xi2;
        this.A00 = c2xi3;
    }

    @Override // X.InterfaceC684236f
    public final void Cwl(boolean z, float f) {
        C2XI c2xi = this.A01;
        Float valueOf = Float.valueOf(f);
        c2xi.A00(valueOf);
        this.A02.A00(valueOf);
        C2XI c2xi2 = this.A00;
        if (!z) {
            f = 1.0f;
        }
        AbstractC25227BEk.A1D(c2xi2, f);
    }
}
