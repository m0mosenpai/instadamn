package X;

/* loaded from: classes9.dex */
public final class PQ2 implements Runnable {
    public final /* synthetic */ C51359MmK A00;
    public final /* synthetic */ C5SW A01;

    public PQ2(C51359MmK c51359MmK, C5SW c5sw) {
        this.A01 = c5sw;
        this.A00 = c51359MmK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SW c5sw = this.A01;
        C51359MmK c51359MmK = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c5sw.A07(c51359MmK.A00);
    }
}
