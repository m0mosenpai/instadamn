package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.61q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC1336161q extends Handler {
    public final Looper A00;

    public HandlerC1336161q(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC1336161q(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC1336161q() {
        this.A00 = Looper.getMainLooper();
    }
}
