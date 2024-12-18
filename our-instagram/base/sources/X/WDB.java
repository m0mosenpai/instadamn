package X;

import android.os.PerformanceHintManager;
import android.os.Process;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WDB {
    public static final WDB A00 = new Object();
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C71785X4m.A00);

    public static final /* synthetic */ PerformanceHintManager A00() {
        return (PerformanceHintManager) A01.getValue();
    }

    public final void A02(int i) {
        PerformanceHintManager performanceHintManager = (PerformanceHintManager) A01.getValue();
        if (performanceHintManager != null) {
            performanceHintManager.createHintSession(new int[]{Process.myPid()}, TimeUnit.MINUTES.toNanos(i));
        }
    }

    public final void A01(int i) {
        int myTid = Process.myTid();
        C14360o3.A0A(Thread.currentThread().getName());
        C14120nc.A00().ATO(new C18320vJ(1763559808, new RunnableC71521WvQ(i, myTid)));
    }
}
