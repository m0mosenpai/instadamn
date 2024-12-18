package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14260nq implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C14120nc.A00().ATO((AbstractRunnableC14200nk) message.obj);
        return true;
    }
}
