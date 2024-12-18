package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.Jbs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43943Jbs implements Runnable {
    public final /* synthetic */ C43939Jbo A00;

    public RunnableC43943Jbs(C43939Jbo c43939Jbo) {
        this.A00 = c43939Jbo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 113);
    }
}
