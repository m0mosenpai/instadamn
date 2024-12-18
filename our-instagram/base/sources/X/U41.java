package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
public final class U41 extends Handler {
    public final Handler.Callback A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U41(Looper looper, Handler.Callback callback) {
        super(looper, new U4M(callback));
        C14360o3.A0B(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        C14360o3.A0B(message, 0);
        if (C14360o3.A0K(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}
