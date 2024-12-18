package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.8er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191958er {
    public static final Looper A00;
    public static final Looper A01;
    public static final Looper A02;
    public static final Looper A03;
    public static final Looper A04;

    static {
        HandlerThread handlerThread = new HandlerThread("SynchronizedData_ReceiveThread", -4);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        A01 = handlerThread.getLooper();
        HandlerThread handlerThread2 = new HandlerThread("Surface_Stories_RenderThread", -4);
        AbstractC09770fa.A00(handlerThread2);
        handlerThread2.start();
        A03 = handlerThread2.getLooper();
        HandlerThread handlerThread3 = new HandlerThread("Surface_Videos_RenderThread", -4);
        AbstractC09770fa.A00(handlerThread3);
        handlerThread3.start();
        A04 = handlerThread3.getLooper();
        HandlerThread handlerThread4 = new HandlerThread("DataNavigation_CleanupThread", 10);
        AbstractC09770fa.A00(handlerThread4);
        handlerThread4.start();
        A00 = handlerThread4.getLooper();
        HandlerThread handlerThread5 = new HandlerThread("DataFetch_LoggingThread", 10);
        AbstractC09770fa.A00(handlerThread5);
        handlerThread5.start();
        A02 = handlerThread5.getLooper();
    }
}
