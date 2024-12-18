package X;

/* renamed from: X.Y9b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73346Y9b implements YPm {
    public C73348Y9d A00;
    public Y68 A01;
    public volatile boolean A02;

    @Override // X.YPm
    public final void DII() {
    }

    @Override // X.YPm
    public final void stop() {
        this.A00 = null;
        this.A02 = false;
    }

    @Override // X.YPm
    public final void DIE() {
        if (this.A00 != null && this.A02) {
            C73348Y9d c73348Y9d = this.A00;
            System.nanoTime();
            if (Thread.currentThread() == c73348Y9d.A01) {
                c73348Y9d.A03.A0I(this);
            } else {
                C73348Y9d.A00(c73348Y9d, this, 3);
            }
        }
    }

    @Override // X.YPm
    public final void Emf(C73348Y9d c73348Y9d) {
        this.A00 = c73348Y9d;
        this.A02 = true;
    }

    @Override // X.YPm
    public final Y68 CFD() {
        return this.A01;
    }

    @Override // X.YPm
    public final void Egs(Y68 y68) {
        this.A01 = y68;
    }
}
