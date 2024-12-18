package X;

import android.os.MessageQueue;
import android.text.TextUtils;
import com.facebook.systrace.Systrace;

/* renamed from: X.1KC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1KC implements MessageQueue.IdleHandler {
    public final String mName;

    public abstract boolean onQueueIdle();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R("onQueueIdle: ", this.mName), 595343043);
        }
        try {
            boolean onQueueIdle = onQueueIdle();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1212704672);
            }
            return onQueueIdle;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1172718714);
            }
            throw th;
        }
    }

    public C1KC(String str) {
        C18C.A0E(!TextUtils.isEmpty(str));
        this.mName = str;
    }
}
