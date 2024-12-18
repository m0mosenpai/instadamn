package X;

import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: X.11P, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11P {
    public static boolean A00;
    public static final MessageQueue A01;

    public static final void A00(MessageQueue.IdleHandler idleHandler) {
        if (A00 && !AbstractC58327PtK.A08()) {
            AbstractC58327PtK.A05(new C9EQ(idleHandler, 30));
        } else {
            A01.addIdleHandler(idleHandler);
        }
    }

    static {
        MessageQueue queue = Looper.getMainLooper().getQueue();
        C14360o3.A07(queue);
        A01 = queue;
    }
}
