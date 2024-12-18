package X;

/* loaded from: classes9.dex */
public final class PQ8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OJs A01;

    public PQ8(OJs oJs, int i) {
        this.A01 = oJs;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A08.scrollTo(this.A00, 0);
    }
}
