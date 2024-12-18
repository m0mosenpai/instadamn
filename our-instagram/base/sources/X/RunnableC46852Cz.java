package X;

import android.os.Looper;

/* renamed from: X.2Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC46852Cz implements Runnable {
    public final /* synthetic */ C41711wL A00;

    public RunnableC46852Cz(C41711wL c41711wL) {
        this.A00 = c41711wL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myQueue().addIdleHandler(new C1KC() { // from class: X.2cV
            @Override // X.C1KC
            public final boolean onQueueIdle() {
                C18720vz c18720vz = AbstractC12960li.A00;
                C226418s A01 = C226218q.A01(c18720vz);
                A01.A0P(A01.A02, "IG_HERO_SERVICE_IDLE_QUEUE_START");
                RunnableC46852Cz.this.A00.A0B();
                C226418s A012 = C226218q.A01(c18720vz);
                A012.A0P(A012.A02, "IG_HERO_SERVICE_IDLE_QUEUE_START");
                return false;
            }

            {
                super("startHeroServiceController");
            }
        });
    }
}
