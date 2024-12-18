package X;

/* renamed from: X.Wdl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70607Wdl implements InterfaceC72173Lq {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C69045Vgm A01;

    @Override // X.InterfaceC72173Lq
    public final float Awi(C3FQ c3fq, float f) {
        return f;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean E5B() {
        return true;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eif() {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eig(C3FQ c3fq) {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eih(C3FQ c3fq) {
        return true;
    }

    public C70607Wdl(C69045Vgm c69045Vgm, float f) {
        this.A00 = f;
        this.A01 = c69045Vgm;
    }

    @Override // X.InterfaceC72173Lq
    public final void DvV(float f) {
        float f2 = f / this.A00;
        C69045Vgm c69045Vgm = this.A01;
        C6FX c6fx = new C6FX();
        c6fx.A01(Float.valueOf(f2));
        C6FW A00 = c6fx.A00();
        C6FP.A03(c69045Vgm.A00, c69045Vgm.A01, A00, c69045Vgm.A02);
    }

    @Override // X.InterfaceC72173Lq
    public final /* synthetic */ boolean EiW() {
        return true;
    }
}
