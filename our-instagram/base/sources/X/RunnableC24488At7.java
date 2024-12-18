package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.At7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24488At7 implements Runnable {
    public final /* synthetic */ RealtimeClientManager A00;

    public RunnableC24488At7(RealtimeClientManager realtimeClientManager) {
        this.A00 = realtimeClientManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeKeepAliveCondition("RTC_CALL_CONDITION");
    }
}
