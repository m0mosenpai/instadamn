package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.AuJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24562AuJ implements Runnable {
    public final /* synthetic */ C209159Mx A00;
    public final /* synthetic */ CountDownLatch A01;

    public RunnableC24562AuJ(C209159Mx c209159Mx, CountDownLatch countDownLatch) {
        this.A00 = c209159Mx;
        this.A01 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C209159Mx c209159Mx = this.A00;
        C209159Mx.A01(c209159Mx);
        C209159Mx.A03(c209159Mx);
        this.A01.countDown();
    }
}
