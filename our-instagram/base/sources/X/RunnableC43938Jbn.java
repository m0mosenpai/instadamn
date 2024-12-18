package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.Jbn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43938Jbn implements Runnable {
    public final /* synthetic */ C43809JYw A00;

    public RunnableC43938Jbn(C43809JYw c43809JYw) {
        this.A00 = c43809JYw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 113);
    }
}
