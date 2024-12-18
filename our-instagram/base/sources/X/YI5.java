package X;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes12.dex */
public final class YI5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C72506XfL A01;
    public final /* synthetic */ Object A02;

    public YI5(C72506XfL c72506XfL, Object obj, int i) {
        this.A01 = c72506XfL;
        this.A00 = i;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72506XfL c72506XfL = this.A01;
        if (c72506XfL.A01 == null) {
            synchronized (c72506XfL) {
                if (c72506XfL.A01 == null) {
                    c72506XfL.A01 = (java.util.Set) c72506XfL.A03.get();
                }
            }
        }
        for (YOl yOl : c72506XfL.A01) {
            int i = this.A00;
            Object obj = this.A02;
            if (yOl.EjB(i, obj)) {
                ScheduledExecutorService scheduledExecutorService = c72506XfL.A02;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = (ScheduledExecutorService) c72506XfL.A05.get();
                    c72506XfL.A02 = scheduledExecutorService;
                }
                yOl.DSb(obj, scheduledExecutorService, i);
            }
        }
    }
}
