package X;

/* renamed from: X.CxP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29392CxP implements InterfaceC74253Vg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    public C29392CxP(C2XI c2xi, C2XI c2xi2, int i) {
        this.A00 = i;
        this.A02 = c2xi;
        this.A01 = c2xi2;
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        AbstractC25227BEk.A1D((C2XI) this.A02, f);
        C2XI c2xi = (C2XI) this.A01;
        if (!z) {
            f = 1.0f;
        }
        AbstractC25227BEk.A1D(c2xi, f);
    }
}
