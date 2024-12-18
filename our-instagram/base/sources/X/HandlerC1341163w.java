package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.63w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC1341163w extends Handler {
    public final Looper A00;

    public HandlerC1341163w(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC1341163w(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC1341163w() {
        this.A00 = Looper.getMainLooper();
    }
}
