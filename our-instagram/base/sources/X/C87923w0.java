package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.3w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87923w0 {
    public static C87923w0 A02;
    public final Handler A00;
    public final HandlerThread A01;

    public static C87923w0 A00() {
        C87923w0 c87923w0 = A02;
        if (c87923w0 == null) {
            C87923w0 c87923w02 = new C87923w0();
            A02 = c87923w02;
            return c87923w02;
        }
        return c87923w0;
    }

    public C87923w0() {
        HandlerThread handlerThread = new HandlerThread("MQD_Bg_Executor", 10);
        AbstractC09770fa.A00(handlerThread);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
