package X;

/* renamed from: X.WvE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71509WvE implements Runnable {
    public final /* synthetic */ C68046V7y A00;
    public final /* synthetic */ V1R A01;

    public RunnableC71509WvE(C68046V7y c68046V7y, V1R v1r) {
        this.A01 = v1r;
        this.A00 = c68046V7y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V1R v1r = this.A01;
        WG5 wg5 = v1r.A0c;
        C68046V7y c68046V7y = this.A00;
        int i = c68046V7y.A00;
        WG5.A01(wg5, i, false);
        WG5.A05(wg5, "FEED_REQUEST_FAIL", i);
        if (c68046V7y.A03) {
            C154846xZ c154846xZ = v1r.A02;
            if (c154846xZ != null) {
                ((MTJ) c154846xZ).A00.A07(AbstractC111324zv.A00(5220));
                C154846xZ c154846xZ2 = v1r.A02;
                if (c154846xZ2 != null) {
                    c154846xZ2.D4q();
                    return;
                }
            }
            C14360o3.A0F("gridPerfLogger");
            throw C00O.createAndThrow();
        }
    }
}
