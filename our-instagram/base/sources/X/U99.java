package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class U99 extends Handler {
    public final WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C66311U8k c66311U8k;
        C14360o3.A0B(message, 0);
        if (message.what == 1 && (c66311U8k = (C66311U8k) this.A00.get()) != null) {
            C66311U8k.A00(c66311U8k);
        }
    }

    public U99(C66311U8k c66311U8k) {
        this.A00 = new WeakReference(c66311U8k);
    }
}
