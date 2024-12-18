package X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.PKn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56843PKn implements Runnable {
    public final /* synthetic */ AbstractC55065OaL A00;

    public RunnableC56843PKn(AbstractC55065OaL abstractC55065OaL) {
        this.A00 = abstractC55065OaL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC55065OaL abstractC55065OaL = this.A00;
        ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
        synchronized (abstractC55065OaL.A06) {
            try {
                abstractC55065OaL.A04.unbindService(abstractC55065OaL.A05);
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
            abstractC55065OaL.A02 = false;
            abstractC55065OaL.A01 = new Object();
        }
    }
}
