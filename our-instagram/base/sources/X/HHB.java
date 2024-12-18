package X;

/* loaded from: classes7.dex */
public final class HHB extends AbstractC60592pi {
    public long A00;
    public long A01;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A01 += System.currentTimeMillis() - this.A00;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A00 = System.currentTimeMillis();
    }
}
