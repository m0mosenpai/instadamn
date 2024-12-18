package X;

import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23301Br {
    public C1Bo A00;
    public C1Bn A01;
    public C23291Bq A02;
    public C1Bm A03;
    public ExecutorService A04;
    public final Random A05;

    public final void A00(C1Bs c1Bs) {
        int i = c1Bs.A00;
        C1Bn c1Bn = this.A01;
        ExecutorService executorService = this.A04;
        C1Bm c1Bm = this.A03;
        Random random = this.A05;
        if (i > 0 && random.nextInt(i) == 0) {
            SHP shp = new SHP(c1Bn, c1Bm, executorService, i);
            shp.A02.submit(new CallableC64782TTu(shp));
        } else {
            random.nextBoolean();
        }
    }

    public C23301Br(C1Bo c1Bo, C1Bn c1Bn, C23291Bq c23291Bq, C1Bm c1Bm, Random random, ExecutorService executorService) {
        this.A01 = c1Bn;
        this.A00 = c1Bo;
        this.A02 = c23291Bq;
        this.A04 = executorService;
        this.A03 = c1Bm;
        this.A05 = random;
    }
}
