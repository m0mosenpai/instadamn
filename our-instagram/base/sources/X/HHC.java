package X;

/* loaded from: classes7.dex */
public final class HHC extends AbstractC60592pi {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C81383k8 A01;

    public HHC(C62862tP c62862tP, C81383k8 c81383k8) {
        this.A01 = c81383k8;
        this.A00 = c62862tP;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A01.A00 = null;
        this.A00.A06(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C6T7 c6t7 = this.A01.A00;
        if (c6t7 != null) {
            c6t7.A04();
        }
    }
}
