package X;

import android.os.HandlerThread;

/* renamed from: X.63b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1339363b {
    public static final HandlerThread A00;

    static {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ResponseThread", -4);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        A00 = handlerThread;
    }
}
