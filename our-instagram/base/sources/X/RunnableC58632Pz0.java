package X;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pz0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58632Pz0 implements Runnable {
    public final /* synthetic */ C58623Pyr A00;
    public final /* synthetic */ C48262Jq A01;

    public RunnableC58632Pz0(C58623Pyr c58623Pyr, C48262Jq c48262Jq) {
        this.A01 = c48262Jq;
        this.A00 = c58623Pyr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48262Jq c48262Jq = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        C58623Pyr c58623Pyr = this.A00;
        boolean z = false;
        for (String str : c58623Pyr.A01.A02) {
            if (C0g3.A00().A01(AbstractC10100gN.A00(str)) != C05F.A0C) {
                A1E.add(str);
                z = true;
            }
        }
        if (z) {
            C58642PzF c58642PzF = new C58642PzF(c58623Pyr, c48262Jq);
            C58640PzD c58640PzD = new C58640PzD(A1E, A1E2);
            C0JO c0jo = c48262Jq.A08;
            long now = c0jo.now() - c48262Jq.A00;
            if (now < 0) {
                try {
                    Thread.sleep(-now);
                } catch (InterruptedException e) {
                    C0K8.A0F("GooglePlayDownloader", "Interrupted while waiting between subsequent download attempts", e);
                }
            }
            c48262Jq.A00 = c0jo.now();
            C5KS EnT = c48262Jq.A0B.EnT(c58640PzD);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Executor executor = c48262Jq.A0D;
            EnT.A09(c58642PzF, executor);
            EnT.A09(new C64270T6u(1, this, countDownLatch), executor);
            try {
                countDownLatch.await(30L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            if (!EnT.A0E()) {
                synchronized (c58642PzF.A02) {
                    c58642PzF.A00 = true;
                }
                c58623Pyr.A00.A00(new Exception(AnonymousClass001.A0R("Never received a response from Google downloading modules: ", c58640PzD.toString())));
            }
        } else {
            c58623Pyr.A00.A01(new C62674SLm(null, null, 1));
        }
        synchronized (c48262Jq) {
            c48262Jq.A04 = false;
            C48262Jq.A01(c48262Jq);
        }
    }
}
