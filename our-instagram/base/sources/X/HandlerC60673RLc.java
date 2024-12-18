package X;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

/* renamed from: X.RLc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC60673RLc extends HandlerC1336161q {
    public final /* synthetic */ C60650RGb A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC60673RLc(Looper looper, C60650RGb c60650RGb) {
        super(looper);
        this.A00 = c60650RGb;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.w("GoogleApiClientImpl", AnonymousClass001.A0O("Unknown message id: ", i));
                return;
            } else {
                C60650RGb.A02(this.A00);
                return;
            }
        }
        C60650RGb c60650RGb = this.A00;
        Lock lock = c60650RGb.A0G;
        lock.lock();
        try {
            if (c60650RGb.A0H()) {
                C60650RGb.A01(c60650RGb);
            }
        } finally {
            lock.unlock();
        }
    }
}
