package X;

/* renamed from: X.BEv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25237BEv implements InterfaceC74253Vg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    public C25237BEv(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, int i) {
        this.A00 = i;
        this.A02 = c2xi;
        this.A03 = c2xi2;
        this.A01 = c2xi3;
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        C2XI c2xi;
        int i = this.A00;
        C2XI c2xi2 = (C2XI) this.A02;
        if (3 - i != 0) {
            Float valueOf = Float.valueOf(f);
            c2xi2.A00(valueOf);
            ((C2XI) this.A03).A00(valueOf);
            c2xi = (C2XI) this.A01;
            if (!z) {
                f = 1.0f;
            }
        } else {
            Float valueOf2 = Float.valueOf(f);
            c2xi2.A00(valueOf2);
            ((C2XI) this.A03).A00(valueOf2);
            c2xi = (C2XI) this.A01;
            if (z) {
                f = (float) Math.min(Math.max(f, ((Number) c2xi.A00).floatValue()), 1.0d);
            }
        }
        c2xi.A00(Float.valueOf(f));
    }
}
