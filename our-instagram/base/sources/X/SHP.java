package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public abstract class SHP {
    public final int A00;
    public final C1Bn A01;
    public final ExecutorService A02;
    public final C1Bm A03;

    public SHP(C1Bn c1Bn, C1Bm c1Bm, ExecutorService executorService, int i) {
        this.A00 = i;
        this.A01 = c1Bn;
        this.A02 = executorService;
        this.A03 = c1Bm;
    }
}
