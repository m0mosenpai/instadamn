package X;

/* loaded from: classes9.dex */
public final class PQN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N6J A01;

    public PQN(N6J n6j, int i) {
        this.A01 = n6j;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OFX ofx = this.A01.A06;
        if (ofx == null) {
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        ofx.A03.smoothScrollTo(0, this.A00);
    }
}
