package X;

/* loaded from: classes10.dex */
public final class TOE implements Runnable {
    public final /* synthetic */ TSP A00;
    public final /* synthetic */ C49802Qq A01;

    public TOE(TSP tsp, C49802Qq c49802Qq) {
        this.A00 = tsp;
        this.A01 = c49802Qq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TSP tsp = this.A00;
        C49802Qq c49802Qq = this.A01;
        if (c49802Qq.A04 <= tsp.A06) {
            tsp.A02.remove(c49802Qq);
            tsp.A01 -= c49802Qq.A03;
        } else {
            tsp.A03.remove(c49802Qq);
            tsp.A00 -= c49802Qq.A03;
        }
    }
}
