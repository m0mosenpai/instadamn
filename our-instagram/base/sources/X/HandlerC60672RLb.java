package X;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.RLb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC60672RLb extends HandlerC1336161q {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("BasePendingResult", AnonymousClass001.A0O("Don't know how to handle message: ", i), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).A08(Status.A0A);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((InterfaceC65404Tjb) pair.first).Dgz((C61j) pair.second);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public HandlerC60672RLb() {
        super(Looper.getMainLooper());
    }
}
