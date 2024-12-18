package X;

/* renamed from: X.Ilo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42140Ilo implements InterfaceC72173Lq {
    public final /* synthetic */ C42429IqW A00;
    public final /* synthetic */ XAp A01;

    @Override // X.InterfaceC72173Lq
    public final float Awi(C3FQ c3fq, float f) {
        return f;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eif() {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eig(C3FQ c3fq) {
        return false;
    }

    public C42140Ilo(C42429IqW c42429IqW, XAp xAp) {
        this.A00 = c42429IqW;
        this.A01 = xAp;
    }

    @Override // X.InterfaceC72173Lq
    public final void DvV(float f) {
        C42429IqW c42429IqW = this.A00;
        float f2 = c42429IqW.A01 - f;
        c42429IqW.A00 = f2;
        if (f2 <= 1.1f) {
            f2 = 0.0f;
            c42429IqW.A00 = 0.0f;
        }
        this.A01.DKL(f2);
    }

    @Override // X.InterfaceC72173Lq
    public final /* synthetic */ boolean E5B() {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final /* synthetic */ boolean EiW() {
        return true;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eih(C3FQ c3fq) {
        return AbstractC167007dF.A1N(c3fq.B6q());
    }
}
